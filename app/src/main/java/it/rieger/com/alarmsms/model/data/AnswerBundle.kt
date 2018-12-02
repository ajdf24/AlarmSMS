package it.rieger.com.alarmsms.model.data

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import it.rieger.com.alarmsms.model.ModelConstants

@Entity(tableName = ModelConstants.ANSWER_BUNDLE_TABLE_NAME)
data class AnswerBundle(@PrimaryKey(autoGenerate = true) val id: Long?,
                        val receiver: String,
                        val message: String,
                        val distance: Int,
                        val sendAnswerEveryTime: Boolean)
