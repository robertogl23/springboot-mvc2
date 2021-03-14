package com.devrob.servicesNotesApp.controller;

import com.devrob.servicesNotesApp.model.CreateNoteForm;
import com.devrob.servicesNotesApp.note.entity.Note;
import com.devrob.servicesNotesApp.note.service.NoteService;
import com.devrob.servicesNotesApp.user.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.validation.Valid;


@Controller
public class NotesAppController  {


    @Autowired
    private NoteService noteService;
    @GetMapping("/list" )
    public String home(Model model){

        model.addAttribute("notesList",noteService.getNotes());
        return "index";
    }
    @GetMapping("/form/note-create" )
    public String formNoteCreate(CreateNoteForm createNoteForm ){
        return "formCreateNote";
    }

    @PostMapping("/")
    public String save(@Valid CreateNoteForm createNoteForm, BindingResult bindingResult){
        if (bindingResult.hasErrors()) {

            return "formCreateNote";
        }
        createNoteForm.setUser_id(1);
        noteService.createNote(createNoteForm);
        return "redirect:/list";
    }

}
