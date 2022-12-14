package com.example.myapplication.feature_note.domain.model

import androidx.compose.runtime.mutableStateListOf
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.myapplication.ui.theme.*
import java.lang.Exception

@Entity
data class Note(
    val title: String,
    val content: String,
    val timestamp: Long,
    val color: Int,
    @PrimaryKey val id: Int? = null
){
    companion object{
        val noteColors = listOf(Violet, RedOrange, RedPink, LightBlue, LightGreen)
    }
}

class InvalidNoteException(message: String): Exception(message)