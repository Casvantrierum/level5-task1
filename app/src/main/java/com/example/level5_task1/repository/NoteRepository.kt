package com.example.level5_task1.repository


import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.level5_task1.database.NotepadRoomDatabase
import com.example.level5_task1.dao.NoteDao
import com.example.level5_task1.model.Note

public class NoteRepository(context: Context) {

    private var noteDao: NoteDao

    init {
        val noteRoomDatabase = NotepadRoomDatabase.getDatabase(context)
        noteDao = noteRoomDatabase!!.noteDao()
    }

    fun getNotepad(): LiveData<Note?> {
        return noteDao.getNotepad()
    }


    suspend fun insertNote(note: Note) {
        noteDao.insertNote(note)
    }

    suspend fun deleteNote(note: Note) {
        noteDao.deleteNote(note)
    }

    suspend fun updateNotepad(note: Note) {
        noteDao.updateNotepad(note)
    }
}
