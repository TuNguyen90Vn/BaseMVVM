package com.tn.basemvvm.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "favorite_pokemon")
data class Pokemon(

    @PrimaryKey(autoGenerate = true)
    val id: Int,

    val name: String?,

    val url: String?

)