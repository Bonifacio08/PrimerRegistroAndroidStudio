package com.BonifacioTech.myapplication.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.BonifacioTech.myapplication.model.Persona

@Database(
    entities = [Persona::class],
    version = 1
)
abstract class RegistroDb:RoomDatabase() {
    abstract val personaDao: PersonaDao
}