package com.raywenderlich.android.cocktails.game.model

import org.junit.jupiter.api.*

class QuestionUnitTest {
    private lateinit var question: Question

    @BeforeEach
    fun setUp() {
        question = Question("CORRECT", "INCORRECT")
    }


    @Test
    fun whenCreatingQuestion_shouldNotHaveAnsweredOption() {
        Assertions.assertNull(question.answeredOption)
    }

    @Test
    fun whenAnswering_shouldHaveAnsweredOption() {
        question.answer("INCORRECT")

        Assertions.assertEquals("INCORRECT", question.answeredOption)
    }

    @Test
    fun whenAnswering_withCorrectOption_shouldReturnTrue() {
        val result = question.answer("CORRECT")

        Assertions.assertTrue(result)
    }

    @Test
    fun whenAnswering_withIncorrectOption_shouldReturnTrue() {
        val result = question.answer("INCORRECT")

        Assertions.assertFalse(result)
    }

    @Test
    fun whenAnswering_shouldInvalidOption_shouldThrowException() {
        assertThrows<IllegalArgumentException> {
            question.answer("INVALID OPTION")
        }
    }

}