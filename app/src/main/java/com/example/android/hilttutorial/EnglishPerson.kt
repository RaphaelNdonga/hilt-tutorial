package com.example.android.hilttutorial

import android.util.Log
import javax.inject.Inject

class EnglishPerson @Inject constructor(): Person {
    override fun speakLanguage() {
        Log.i("EnglishPerson", "Hello kind sir")
    }
}