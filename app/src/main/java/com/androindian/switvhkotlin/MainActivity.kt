package com.androindian.switvhkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        switch1.setOnCheckedChangeListener { buttonView, isChecked ->
            if(isChecked==true){
                Toast.makeText(this@MainActivity,"SON",Toast.LENGTH_LONG).show()
            }else{
                Toast.makeText(this@MainActivity,"SOff",Toast.LENGTH_LONG).show()
            }
        }
    }
}
