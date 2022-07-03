package com.example.TodoList.list;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;

import java.util.List;

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
}
