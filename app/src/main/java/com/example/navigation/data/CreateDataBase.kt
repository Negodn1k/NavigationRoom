package com.example.navigation.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(
    entities = [
        User::class
    ],
    version = 1
)

abstract class CreateDataBase : RoomDatabase() {
    abstract val dao: UserDAO
    companion object {
        fun create(context: Context): CreateDataBase {
            return Room.databaseBuilder(
                context,
                CreateDataBase::class.java,
                "test.db"
            ).build()
        }
    }
}