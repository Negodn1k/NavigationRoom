package com.example.navigation.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity("user_list")
data class User(
    @PrimaryKey(autoGenerate = true) val id: Int,
    val login: String,
    val password: String,
)
