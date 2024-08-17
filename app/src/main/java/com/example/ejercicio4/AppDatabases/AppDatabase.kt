package com.example.ejercicio4.AppDatabases

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.ejercicio4.DAOs.PersonaDAO
import com.example.ejercicio4.Entities.Persona

@Database (entities = [Persona::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun PersonaDAO(): PersonaDAO

    companion object {

        @Volatile
        private var INSTANCE : AppDatabase? = null

        fun getDatabase(context: Context) : AppDatabase {

            return  INSTANCE ?: synchronized(  this){

                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java,
                    name = "AppDatabase"
                ).build()

                INSTANCE = instance
                instance

            }
        }
    }

}