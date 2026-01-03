package com.example.noteapp.feature_note.data.data_source

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.noteapp.feature_note.domain.model.Note

@Database(
    entities = [Note::class],
    version = 1
)
abstract class NoteDatabase: RoomDatabase() { //Room이 구현체를 자동 생성, 우리는 틀만 정의
    abstract val noteDao: NoteDao //DAO연결


}