package com.tn.basemvvm.db

import androidx.room.Dao
import androidx.room.Insert

@Dao
interface PokemonDAO {

    @Insert
    fun insert()

}