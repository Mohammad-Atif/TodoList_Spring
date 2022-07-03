package com.example.TodoList.list;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/todo")
public class NoteController {


    private final NoteService noteService;

    @Autowired
    public NoteController(NoteService noteService) {
        this.noteService = noteService;
    }

    @PostMapping(value = "/addNote")
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
