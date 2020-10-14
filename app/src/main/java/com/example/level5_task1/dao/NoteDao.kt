package com.example.level5_task1.dao


import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.level5_task1.model.Note

@Dao
interface NoteDao {

    @Query("SELECT * FROM NoteTable LIMIT 1")
    fun getNotepad(): LiveData<Note?>

    @Insert
    suspend fun insertNote(note: Note)

    @Delete
    suspend fun deleteNote(note: Note)

    @Update
    suspend fun updateNotepad(note: Note)
}
