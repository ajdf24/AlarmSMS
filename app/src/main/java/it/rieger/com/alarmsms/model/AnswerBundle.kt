package it.rieger.com.alarmsms.model

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity(tableName = "answer_bundles")
data class AnswerBundle(@PrimaryKey(autoGenerate = true) val id: Long?,
                        val receiver: String,
                        val message: String,
                        val distance: Int,
                        val sendAnswerEveryTime: Boolean)
