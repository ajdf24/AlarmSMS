package it.rieger.com.alarmsms.model.dao

import android.arch.persistence.room.*
import it.rieger.com.alarmsms.model.ModelConstants
import it.rieger.com.alarmsms.model.data.Rule

@Dao
interface RuleDao {

    @Query("SELECT * from " + ModelConstants.RULE_TABLE_NAME)
    fun getAll(): List<Rule>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(rule: Rule)

    @Query("DELETE from " + ModelConstants.RULE_TABLE_NAME)
    fun deleteAll()

    @Delete
    fun delete(rule: Rule)
}