package com.ganeshgfx.androidtesting
import org.junit.Assert.*
import org.junit.runners.Parameterized
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(value = Parameterized::class)
class ParameterizedHelperTest(private val input:String, private val expectedValue:Boolean) {
    @Test
    fun test(){
        val helper = Helper()
        val result = helper.isPallindrome(input)
        assertEquals(expectedValue,result)
    }
    companion object{
        @JvmStatic
        @Parameterized.Parameters(name = "{index} : {0} is palli {1}")
        fun data():List<Array<Any>>{
            return listOf(
                arrayOf("hello",false),
                arrayOf("level",true),
                arrayOf("a",true),
                arrayOf("",true)
            )
        }
    }
}