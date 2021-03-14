package com.devrob.servicesNotesApp.note.repository;

import com.devrob.servicesNotesApp.note.entity.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoteRepository extends JpaRepository<Note,Integer> {
}
