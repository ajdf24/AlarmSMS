package it.rieger.com.alarmsms.model.data

import android.arch.persistence.room.Embedded
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import it.rieger.com.alarmsms.model.ModelConstants

@Entity(tableName = ModelConstants.RULE_TABLE_NAME)
data class Rule(@PrimaryKey(autoGenerate = true) val id: Long?,
                val ruleName: String,
                val sender: String,
                val occuredWords: String,
                val nonOccuredWords: String,
                @Embedded
                val alarmSound: Sound,
                @Embedded
                val automaticalAnswer: AnswerBundle,
                val navigationTarget: String,
                val readThisMessage: Boolean,
                val readOtherMessages: Boolean,
                val activateLight: Boolean = false,
                val lightTime: Int = 30000)

