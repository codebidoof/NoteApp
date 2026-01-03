package com.example.noteapp.feature_note.domain.use_case

//뷰모델에 inject할 유즈클래스
data class NoteUseCases(
    val getNotes: GetNotes,
    val deleteNote: DeleteNote
)
