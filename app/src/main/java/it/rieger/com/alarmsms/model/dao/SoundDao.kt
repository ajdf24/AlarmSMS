package it.rieger.com.alarmsms.model.dao

import android.arch.persistence.room.*
import it.rieger.com.alarmsms.model.ModelConstants
import it.rieger.com.alarmsms.model.data.Sound

@Dao
interface SoundDao {

    @Query("SELECT * from " + ModelConstants.RULE_TABLE_NAME)
    fun getAll(): List<Sound>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(sound: Sound)

    @Query("DELETE from " + ModelConstants.RULE_TABLE_NAME)
    fun deleteAll()

    @Delete
    fun delete(sound: Sound)
}