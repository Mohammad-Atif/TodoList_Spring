package com.example.TodoList.list;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

public interface NoteRepository extends JpaRepository<Note,Long> {
}
