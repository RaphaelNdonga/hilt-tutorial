package com.example.android.hilttutorial

import android.util.Log
import javax.inject.Inject

class SpanishPerson @Inject constructor():Person {
    override fun speakLanguage() {
       Log.i("SpanishPerson","Despacito senor")
    }
}