package com.example.TodoList.list;


public class Note {
    private String note;
    private int id;

    public Note() {
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Note{" +
                "note='" + note + '\'' +
                ", id=" + id +
                '}';
    }
}
