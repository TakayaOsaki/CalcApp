package jp.techacademy.takaya.oosaki.calcapp

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            if(emptycheck(0) == -1){
                Toast.makeText(this, "何か数値を入力してください", Toast.LENGTH_LONG).show();
            }
            else{
                intent.putExtra("RESULT", editText1.text.toString().toFloat() + editText2.text.toString().toFloat())
                startActivity(intent)
            }
        }
        button2.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            if(emptycheck(0) == -1){
                Toast.makeText(this, "何か数値を入力してください", Toast.LENGTH_LONG).show();
            }
            else{
                intent.putExtra("RESULT", editText1.text.toString().toFloat() - editText2.text.toString().toFloat())
                startActivity(intent)
            }
        }
        button3.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            if(emptycheck(0) == -1){
                Toast.makeText(this, "何か数値を入力してください", Toast.LENGTH_LONG).show();
            }
            else{
                intent.putExtra("RESULT", editText1.text.toString().toFloat() * editText2.text.toString().toFloat())
                startActivity(intent)
            }
        }
        button4.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            if(emptycheck(1) == -1){
                Toast.makeText(this, "何か数値を入力してください", Toast.LENGTH_LONG).show();

            }else if(emptycheck(1) == -2){
                Toast.makeText(this, "Value 2には 0 以外の数値を入力してください", Toast.LENGTH_LONG).show();
            }else{
                intent.putExtra("RESULT", editText1.text.toString().toFloat() / editText2.text.toString().toFloat())
                startActivity(intent)
            }
        }
    }

    private fun emptycheck(Flg: Int): Int{

        val value1  = editText1.text.toString()
        val value2 = editText2.text.toString()

        if(Flg == 1){
            if(value2 == "0"){
                return -2
            }
        }
        if(value1 == "" || value2 ==""){

            return -1;
        }
        else{
            return 0;
        }
    }
}
