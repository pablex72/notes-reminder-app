package com.ensolvers.notes.services;

import com.ensolvers.notes.dto.NoteDTO;
import com.ensolvers.notes.exceptions.AlreadyExistsException;
import com.ensolvers.notes.models.Note;

import java.util.List;
import java.util.Optional;

public interface NoteService {
    Note findNote(String title);

    Optional<Note> findNote(Integer id);

    void createNote(NoteDTO noteDTO) throws AlreadyExistsException;

    List<NoteDTO> getNotesAll();

    List<NoteDTO> getNotesActive();

    List<NoteDTO> getNotesArchived();

    void updateNote(Integer id, NoteDTO noteDTO);

    void deleteNote(Note note);

    void toggleIsArchived(Integer noteId);

    List<NoteDTO> getNoteById(Integer noteId);
}

