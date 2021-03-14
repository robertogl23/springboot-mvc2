package com.devrob.servicesNotesApp.model;


import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

public class CreateNoteForm {
    @NotEmpty

    @Max(20)
    private String title;

    @NotEmpty

    @Max(100)
    private String description;


    private int user_id;
    public CreateNoteForm() {
    }

    public CreateNoteForm(String title, String description) {
        this.title = title;
        this.description = description;
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

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }
}
