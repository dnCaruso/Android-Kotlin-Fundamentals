package com.example.convidadosapp.repository

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.convidadosapp.model.GuestModel

@Dao
interface GuestDao {

    @Insert
    fun insert(guest: GuestModel) : Long

    @Update
    fun update(guest: GuestModel) : Int

    @Delete
    fun delete(guest: GuestModel)

    @Query("SELECT * FROM GUEST WHERE id = :id")
    fun get(id: Int) :  GuestModel

    @Query("SELECT * FROM GUEST")
    fun getAll(): List<GuestModel>

    @Query("SELECT * FROM GUEST WHERE presence = 1")
    fun getPresent(): List<GuestModel>

    @Query("SELECT * FROM GUEST WHERE presence = 0")
    fun getAbsent(): List<GuestModel>

}