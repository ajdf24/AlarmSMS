package it.rieger.com.alarmsms.model

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity(tableName = "rules")
data class Rule(@PrimaryKey(autoGenerate = true) val id: Long?,
                val ruleName: String,
                val sender: String,
                val occuredWords: String,
                val nonOccuredWords: String,
                val alarmSound: Sound,
                val automaticalAnswer: AnswerBundle,
                val navigationTarget: String,
                val readThisMessage: Boolean,
                val readOtherMessages: Boolean,
                val activateLight: Boolean = false,
                val lightTime: Int = 30000)

