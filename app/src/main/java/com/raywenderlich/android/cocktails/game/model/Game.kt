package com.raywenderlich.android.cocktails.game.model

class Game(private val questions: List<Question>,
           highest: Int = 0) {
    var currentScore = 0
        private set

    var highestScore = highest
        private set

    var questionsList = questions

    fun incrementScore() {
        currentScore++
        if (currentScore > highestScore) {
            highestScore = currentScore
        }
    }
}