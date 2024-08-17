package com.example.ejercicio4.DAOs

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.ejercicio4.Entities.Persona

@Dao
interface PersonaDAO {

    @Insert
    fun insertPersona(persona: Persona)

    @Update
    fun updatePersona(persona: Persona)

    @Delete
    fun deletePersona(persona: Persona)

    @Query("SELECT * FROM Persona")
    fun selectAllPersona() : List<Persona>

    @Query("SELECT * FROM Persona WHERE id = :id ")
    fun selectPersona(id: Int) : Persona
}