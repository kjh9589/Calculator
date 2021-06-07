package com.teamnoyes.calculator

import androidx.room.Database
import androidx.room.RoomDatabase
import com.teamnoyes.calculator.dao.HistoryDao
import com.teamnoyes.calculator.model.History

@Database(entities = [History::class], version = 1)
abstract class AppDatabase: RoomDatabase() {
    abstract fun historyDao(): HistoryDao
}