package com.example.TodoList.list;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;

import java.util.List;
import java.util.Optional;

@Service
public class NoteService {

    private final NoteRepository noteRepository;

    @Autowired
    public NoteService(NoteRepository noteRepository) {
        this.noteRepository = noteRepository;
    }

    public void addNote(String note)
    {
        Note nt = new Note();
        nt.setNote(note);
        noteRepository.save(nt);
    }

    public List<Note> getNotes()
    {
        return noteRepository.findAll();
    }


    public void deleteNote(Long studentId)
    {
        boolean doesExist = noteRepository.existsById(studentId);
        if(!doesExist)
            throw new IllegalStateException("note does not exists");
        noteRepository.deleteById(studentId);
    }

    @Transactional
    public void updateNote(Long id, String newNote) {
        Optional<Note> noteOptional = noteRepository.findById(id);
        if(noteOptional.isEmpty())
        {
            throw new IllegalStateException("note does not exists");
        }
        Note note = noteOptional.get();
        if(newNote.length() == 0)
        {
            deleteNote(id);
        }
        else
        {
            note.setNote(newNote);
        }

    }
}
