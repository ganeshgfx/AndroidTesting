package com.ganeshgfx.androidtesting

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import com.google.gson.JsonSyntaxException

import org.junit.Test
import java.io.FileNotFoundException

import org.junit.Assert.*

class QuoteManagerTest {
//
//    @Before
//    fun setUp() {
//    }
//
//    @After
//    fun tearDown() {
//    }

    @Test(expected = FileNotFoundException::class)
    fun populateQuoteFromAssets() {
        val quoteManager = QuoteManager()
        val context = ApplicationProvider.getApplicationContext<Context>()
        quoteManager.populateQuoteFromAssets(context,"")
    }
    @Test(expected = JsonSyntaxException::class)
    fun testPopulateQuoteFromAssets_invalidJson_expected_exception() {
        val quoteManager = QuoteManager()
        val context = ApplicationProvider.getApplicationContext<Context>()
        quoteManager.populateQuoteFromAssets(context,"wrongquotes.json")
    }
    @Test
    fun testPopulateQuoteFromAssets_validJson_expected_exception() {
        val quoteManager = QuoteManager()
        val context = ApplicationProvider.getApplicationContext<Context>()
        quoteManager.populateQuoteFromAssets(context,"quotes.json")
        assertEquals(1643 ,quoteManager.quoteList.size)
    }
    @Test
    fun testPreviousQuote_expected_CorrectQuote(){
        //arrangehhy]kkl
        val quoteManager = QuoteManager()
        quoteManager.populateQuote(
            arrayOf(
                Quote(text="This is a Quote",author = "1"),
                Quote(text="This is a Quote",author = "2"),
                Quote(text="This is a Quote",author = "3"),
                Quote(text="This is a Quote",author = "4"),
                Quote(text="This is a Quote", author = "5"),
                )
        )
        //act
        val quote = quoteManager.getPreviousQuote()
        assertEquals("1",quote.author)
    }
}