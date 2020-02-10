package jp.techacademy.takaya.oosaki.calcapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val value = intent.getFloatExtra("RESULT", 0.0f)

        textView.text = value.toString()
    }
}
