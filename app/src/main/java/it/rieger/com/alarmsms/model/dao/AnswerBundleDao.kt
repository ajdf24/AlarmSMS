package it.rieger.com.alarmsms.model.dao

import android.arch.persistence.room.*
import it.rieger.com.alarmsms.model.ModelConstants
import it.rieger.com.alarmsms.model.data.AnswerBundle
import it.rieger.com.alarmsms.model.data.Rule

@Dao
interface AnswerBundleDao {

    @Query("SELECT * from " + ModelConstants.ANSWER_BUNDLE_TABLE_NAME)
    fun getAll(): List<AnswerBundle>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(answerBundle: AnswerBundle)

    @Query("DELETE from " + ModelConstants.ANSWER_BUNDLE_TABLE_NAME)
    fun deleteAll()

    @Delete
    fun delete(answerBundle: AnswerBundle)
}