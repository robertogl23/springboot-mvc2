package com.devrob.servicesNotesApp.note.controller;

import com.devrob.servicesNotesApp.note.entity.Note;
import com.devrob.servicesNotesApp.note.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/note")
public class NoteController {
    @Autowired
    private NoteService noteService;
    @GetMapping
    public List<?> notes(){
        return noteService.getNotes();
    }
    @PostMapping
    public Note create(@RequestBody Note note){
        return null;
    }
}
