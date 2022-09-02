package com.example.myapplication.feature_note.domain.use_case

import com.example.myapplication.feature_note.domain.NoteRepository
import com.example.myapplication.feature_note.domain.model.Note

class DeleteNote(
    private val repository: NoteRepository
) {

    suspend operator fun invoke(note: Note){
        repository.deleteNote(note)
    }
}