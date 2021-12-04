package com.raywenderlich.android.cocktails.game.model

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeEach


class GameUnitTests {
    private lateinit var game: Game

    @BeforeEach
    fun setUp() {
        val question1 = Question("CORRECT", "INCORRECT")
        val question2 = Question("CORRECT", "INCORRECT")
        val questions = listOf(question1, question2)

        game = Game(questions, 10)
    }

    @Test
    fun whenIncrementingScore_shouldIncrementCurrentScore() {
        game.incrementScore()

        Assertions.assertEquals(1, game.currentScore, "Current score should be 1")
    }

    @Test
    fun whenIncrementingScore_aboveHighScore_shouldAlsoIncrementHighScore() {
        game.incrementScore()

        Assertions.assertEquals(10, game.highestScore)
    }

    @Test
    fun whenIncrementingScore_belowHighScore_shouldNotIncrementHighScore() {
        game.incrementScore()

        Assertions.assertEquals(10, game.highestScore)
    }

    @Test
    fun whenGameStarts_shouldHaveListOfQuestions() {
        Assertions.assertEquals(2, game.questionsList.size)
    }

    @Test
    fun whenGettingNextQuestion_shouldReturnIt() {

    }
}