package com.example.android.hilttutorial

import android.util.Log

class SpanishPerson(val englishPerson: EnglishPerson) {
    fun speakSpanish(){
        Log.i("SpanishPerson","Despacito senor")
    }
}