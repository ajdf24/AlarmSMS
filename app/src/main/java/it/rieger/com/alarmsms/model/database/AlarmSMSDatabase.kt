package it.rieger.com.alarmsms.model.database

import android.arch.persistence.room.Database
import android.arch.persistence.room.Room
import android.arch.persistence.room.RoomDatabase
import android.content.Context
import it.rieger.com.alarmsms.model.ModelConstants
import it.rieger.com.alarmsms.model.dao.RuleDao
import it.rieger.com.alarmsms.model.data.Rule

@Database(entities = arrayOf(Rule::class), version = 1)
abstract class AlarmSMSDatabase : RoomDatabase() {

    abstract fun ruleDao(): RuleDao

    companion object {
        private var INSTANCE: AlarmSMSDatabase? = null

        fun getInstance(context: Context): AlarmSMSDatabase? {
            if(INSTANCE == null) {
                synchronized(AlarmSMSDatabase::class) {
                    INSTANCE = Room.databaseBuilder(context.applicationContext, AlarmSMSDatabase::class.java, ModelConstants.DatabaseName).build()
                }
            }
            return INSTANCE
        }
    }

    fun destroyInstance() {
        INSTANCE = null
    }
}