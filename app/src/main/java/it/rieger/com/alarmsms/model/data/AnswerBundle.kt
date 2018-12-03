package it.rieger.com.alarmsms.model.data

data class AnswerBundle(val receiver: String,
                        val message: String,
                        val distance: Int,
                        val sendAnswerEveryTime: Boolean)
