package com.ganeshgfx.androidtesting.utils

class Utils {
    fun passCheck(input: String) = when {
        input.isBlank() -> "Password is empty"
        input.length < 6 -> "Password should greater than 6"
        input.length > 15 -> "Password should less than 15"
        else -> "Valid"
    }
}