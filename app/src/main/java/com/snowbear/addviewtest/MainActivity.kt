package com.snowbear.addviewtest


import android.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.Layout
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.*
import androidx.constraintlayout.widget.ConstraintSet
import java.lang.reflect.Type


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val layoutEdit = findViewById<LinearLayout>(R.id.liner_layout)  //定義元件要放的layout
        val but_dal = findViewById<Button>(R.id.but_dal)
        val main_text = findViewById<TextView>(R.id.main_text)
        var itenList = mutableListOf<String>()

        //LayoutInflater必須把它放在可以觸發的位置，不然APP執行時會崩饋
        val view = LayoutInflater.from(this).inflate(R.layout.data_item, null, false)
        layoutEdit.addView(view)

        var editFlag =  false
        var editcount = 0
        val editItem = view.findViewById<EditText>(R.id.edit_item)
        editItem.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                main_text.setText("" + s)
                if (start == 0 && editFlag == false) {
//                    val view = LayoutInflater.from(this@MainActivity).inflate(R.layout.data_item, null, false)
//                    layoutEdit.addView(view)
                }
            }
        })

        but_dal.setOnClickListener {
//            val edit = view.findViewById<EditText>(R.id.edit_1)

//            val but_x = but_dal.scaleX * 0.8f
//            val but_y = but_dal.scaleY * 0.8f
//            but_dal.scaleX = but_dal.scaleX * 0.8f
//            but_dal.scaleY = but_dal.scaleY * 0.8f

        }
    }

    //下方為edit的輸入觸發fun，還在研究中
//    fun EditText.addTextChangedListener(onChage: (String) -> Unit) {
//
//        addTextChangedListener(object : TextWatcher {
//            override fun afterTextChanged(s: Editable?) {
//                onChage(s.toString())
//            }
//
//            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
//            }
//
//            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
//            }
//        })
//    }
}