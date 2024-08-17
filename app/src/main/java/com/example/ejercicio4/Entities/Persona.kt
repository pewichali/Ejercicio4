package com.example.ejercicio4.Entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Persona(
    @PrimaryKey
    var id : Int?,

    @ColumnInfo(name = "PrimerNombre")
    var PrimerNombre : String,

    @ColumnInfo(name = "SegundoNombre")
    var SegundoNombre : String,

    @ColumnInfo(name = "PrimerApellido")
    var PrimerApellido : String,

    @ColumnInfo(name = "SegundoApellido")
    var SegundoApellido : String,

    @ColumnInfo(name = "Sexo")
    var Sexo : String,

    @ColumnInfo(name = "Telefono")
    var Telefono : String,

    )
