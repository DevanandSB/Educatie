package com.edu.educatie.listerners;
import com.edu.educatie.entities.Note;

public interface NotesListener {
    void onNoteClicked(Note note, int position);
}
