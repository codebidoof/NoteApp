package com.example.noteapp.feature_note.data.data_source

import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.noteapp.feature_note.domain.model.Note
import kotlinx.coroutines.flow.Flow

interface NoteDao {

    @Query("SELECT * FROM note")
    fun getNotes(): Flow<List<Note>> //Flow는 suspend가 필요 없다

    @Query("SELECT * FROM note Where id = :id")
    suspend fun getNoteById(id: Int): Note?

    @Insert(onConflict = OnConflictStrategy.REPLACE) //“같은 PK가 이미 있으면, 기존 데이터 지우고 새로 넣어라
    suspend fun insertNote(note: Note)

    @Delete
    suspend fun deleteNote(note: Note)
}