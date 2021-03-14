package com.devrob.servicesNotesApp.note.entity;

import com.devrob.servicesNotesApp.user.entity.User;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;

@Entity
public class Note {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE )
    private int idNote;


    @Column(nullable = false,length = 20)
    private String title;

    @Column(nullable = false,length = 100)
    private String description;

    @OneToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "id_user",nullable = false)
    private User user;
    public Note() {
    }

    public Note( String title, String description,User user) {
        this.title = title;
        this.description = description;
        this.user =user;
    }

    public int getIdNote() {
        return idNote;
    }

    public void setIdNote(int idNote) {
        this.idNote = idNote;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
