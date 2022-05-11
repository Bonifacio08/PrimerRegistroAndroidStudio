package com.BonifacioTech.myapplication.data

import androidx.room.*
import com.BonifacioTech.myapplication.model.Persona
import java.util.concurrent.Flow

@Dao
interface PersonaDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun Insertar(persona: Persona)

    @Delete
    suspend fun Eliminar(persona: Persona)

    @Query("SELECT * FROM Personas Where personaId = personaId")
    fun Buscar(personaId: Int): Flow<Persona>

    @Query("SELECT * FROM  Personas ORDER BY personaId")

    fun GetLista(): Flow<List<Persona>>


}