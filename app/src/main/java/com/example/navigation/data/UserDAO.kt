package com.example.navigation.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface UserDAO {
    @Query("SELECT * FROM user_list")
    fun getUserList(): Flow<List<User>>

    @Query("Select password from user_list where (:enteredLogin)")
    fun getPassword(enteredLogin: String): String

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertRegistration(newUser: User)

    @Delete
    fun deleteUser(oldUser: User)
}