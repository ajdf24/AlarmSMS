package it.rieger.com.alarmsms.model.data

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity(tableName = "sounds")
data class Sound (@PrimaryKey(autoGenerate = true) val id: Long?,
                  val soundName: String,
                  val soundId: String,
                  val internalSound: Boolean)
