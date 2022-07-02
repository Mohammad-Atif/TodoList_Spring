package com.example.TodoList.list;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/todo")
public class NoteController {


    @GetMapping
    public void addNote(@RequestParam String note)
    {
        System.out.println(note);
    }
}
