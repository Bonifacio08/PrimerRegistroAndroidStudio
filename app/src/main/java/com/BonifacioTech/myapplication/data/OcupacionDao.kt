package com.BonifacioTech.myapplication.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import java.util.concurrent.Flow

@Dao
interface OcupacionDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun Insertar(ocupacion: Ocupacion)

    @delete
    suspend fun Eliminar(ocupacion: Ocupacion)

    @Query(""
        SELECT * FROM Ocupaciones   WHERE ocupacionId=:ocupacionId
    "")
    fun GetLista():Flow<List<Ocupacion>>
}