package com.example.TodoList.list;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/todo")
public class NoteController {


    private final NoteService noteService;

    @Autowired
    public NoteController(NoteService noteService) {
        this.noteService = noteService;
    }

    @GetMapping(value = "/addNote")
    public void addNote(@RequestParam String note)
    {
        noteService.addNote(note);
    }

    @GetMapping(value = "/getAll")
    public List<Note> getNotes()
    {
        return noteService.getNotes();
    }

}
