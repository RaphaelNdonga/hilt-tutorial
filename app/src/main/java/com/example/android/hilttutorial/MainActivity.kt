package com.example.android.hilttutorial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    private lateinit var spanishPerson: SpanishPerson
    private lateinit var englishPerson: EnglishPerson
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        englishPerson = EnglishPerson()
        spanishPerson = SpanishPerson(englishPerson)
        spanishPerson.speakSpanish()
        spanishPerson.englishPerson.speakEnglish()
    }
}