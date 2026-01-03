package com.example.noteapp.feature_note.domain.use_case

//뷰모델에 inject할 유즈클래스
//래퍼 클래스 -> 주입을 쉽게 한다.
data class NoteUseCases(
    val getNotes: GetNotes,
    val deleteNote: DeleteNote,
    val addNote: AddNote
)
