package com.ganeshgfx.androidtesting

import org.junit.After
import org.junit.Assert.*
import org.junit.Before

import org.junit.Test

class HelperTest {

    lateinit var helper : Helper

    @Before
    fun setUp(){
        println("Started...")
        helper = Helper()
    }
    @After
    fun endUp(){
        println("Ended...")
    }

    @Test
    fun isPalindrome_Empty() {
        //Arrange
        //Act
        val result = helper.isPallindrome("")
        //Assert
        assertEquals(true,result)
    }
    @Test
    fun isPalindrome() {
        //Arrange
        //Act
        val result = helper.isPallindrome("hello")
        //Assert
        assertEquals(false,result)
    }
    @Test
    fun isPalindrome_inputString_level_expectedTrue() {
        //Arrange
        //Act
        val result = helper.isPallindrome("level")
        //assert
        assertEquals(true,result)
    }
}