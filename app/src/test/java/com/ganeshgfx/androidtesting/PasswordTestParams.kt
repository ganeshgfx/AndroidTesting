package com.ganeshgfx.androidtesting

import com.ganeshgfx.androidtesting.utils.Utils
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import org.junit.runners.Parameterized.Parameters

@RunWith(value = Parameterized::class)
class PasswordTestParams(private val password:String,private val expected:String) {
    @Test
    fun test(){
        val utils = Utils()
        val result = utils.passCheck(password)
        Assert.assertEquals(expected,result)
    }
    companion object{
        @JvmStatic
        @Parameters(name = "{0} - {1}")
        fun data():List<Array<Any>> = listOf(
            arrayOf("         ","Password is empty"),
            arrayOf("ab","Password should greater than 6"),
            arrayOf("qwertyuiopasdfghjklzxcvbnm","Password should less than 15"),
            arrayOf("Ganesh12","Valid")
        )
    }
}