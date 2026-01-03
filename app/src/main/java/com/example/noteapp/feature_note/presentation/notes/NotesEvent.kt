package com.example.noteapp.feature_note.presentation.notes

import com.example.noteapp.feature_note.domain.model.Note
import com.example.noteapp.feature_note.domain.util.NoteOrder


//UI 이벤트(Event) 모델, “유저가 한 행동”을 표현하기 위한 클래스
sealed class NotesEvent {
    //data class: 추가 정보가 필요할 때
    data class Order(val noteOrder: NoteOrder): NotesEvent()
    data class DeleteNote(val note: Note): NotesEvent()

    //object : “행동 자체”만 중요할 때
    object RestoreNote: NotesEvent()
    object ToggleOrderSection: NotesEvent()
}