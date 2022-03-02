package com.example.kotlinnoteapp.feature_note.domain.use_case

import com.example.kotlinnoteapp.feature_note.presentation.GetNotes

data class NoteUseCases(
    val getNotes: GetNotes,
    val deleteNote: DeleteNote,
    val addNote: AddNote,
    val getNote: GetNote
)