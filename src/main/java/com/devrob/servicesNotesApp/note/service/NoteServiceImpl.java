package com.devrob.servicesNotesApp.note.service;

import com.devrob.servicesNotesApp.model.CreateNoteForm;
import com.devrob.servicesNotesApp.note.entity.Note;
import com.devrob.servicesNotesApp.note.repository.NoteRepository;
import com.devrob.servicesNotesApp.user.entity.User;
import com.devrob.servicesNotesApp.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class NoteServiceImpl implements NoteService{
    @Autowired
    private NoteRepository noteRepository;
    @Autowired
    private UserRepository userRepository;

    @Override
    public List<Note> getNotes() {
        return noteRepository.findAll();
    }

    @Override
    public Note createNote(CreateNoteForm noteForm) {

        User u = userRepository.getOne(noteForm.getUser_id());
        Note note = new Note(noteForm.getTitle(),noteForm.getDescription(),u);
        return noteRepository.save(note);
    }

}
