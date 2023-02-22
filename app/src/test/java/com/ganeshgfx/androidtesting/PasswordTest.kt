package com.ganeshgfx.androidtesting

import com.ganeshgfx.androidtesting.utils.Utils
import org.junit.Assert
import org.junit.Test

class PasswordTest {
    @Test
    fun validatePassword_blankInput_expectedRequiredField(){
        val sut = Utils()
        val result = sut.passCheck("    ")
        Assert.assertEquals("Password is empty",result)
    }
    @Test
    fun validatePassword_TwoCharInput_expectedLessNumberOfChar(){
        val sut = Utils()
        val result = sut.passCheck("gs")
        Assert.assertEquals("Password should greater than 6",result)
    }
    @Test
    fun validatePassword_TwoCharInput_expectedMoreNumberOfChar(){
        val sut = Utils()
        val result = sut.passCheck("gssafskjfnsjfofnfnsdfsjfnsj")
        Assert.assertEquals("Password should less than 15",result)
    }
    @Test
    fun validatePassword_ValidInput_expectedValid(){
        val sut = Utils()
        val result = sut.passCheck("Ganesh9")
        Assert.assertEquals("Valid",result)
    }
}
