package com.example.TodoList.list;





import javax.persistence.*;

@Entity
@Table
public class Note {
    private String note;
    @Id
    @SequenceGenerator(
            name = "student_sequence",
            sequenceName ="student_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "student_sequence"
    )
    private Long id;

    public Note() {
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
