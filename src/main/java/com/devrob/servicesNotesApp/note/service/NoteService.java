package com.devrob.servicesNotesApp.note.service;

import com.devrob.servicesNotesApp.model.CreateNoteForm;
import com.devrob.servicesNotesApp.note.entity.Note;

import java.util.List;

public interface NoteService {
    public List<Note> getNotes();
    public Note createNote(CreateNoteForm noteForm);
}
