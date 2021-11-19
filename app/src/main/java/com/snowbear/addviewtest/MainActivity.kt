package com.snowbear.addviewtest



import android.animation.TypeEvaluator
import android.animation.ValueAnimator
import android.app.usage.UsageEvents
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.LayoutInflater
import android.view.MotionEvent
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.core.graphics.scaleMatrix
import java.lang.annotation.ElementType


class MainActivity : AppCompatActivity() {
    val TAG = javaClass.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val layoutEdit = findViewById<LinearLayout>(R.id.liner_layout)  //定義元件要放的layout
        val but_dal = findViewById<Button>(R.id.but_dal)
        val main_text = findViewById<TextView>(R.id.main_text)


        //LayoutInflater必須把它放在可以觸發的位置，不然APP執行時會崩饋
        val view = LayoutInflater.from(this).inflate(R.layout.data_item, null, false)

//        val itemNumber = view.findViewById<TextView>(R.id.tV_number)
//        layoutEdit.addView(view)
//        itemNumber.setText("1")
        itemData()

        var editFlag = false
        var editcount = 0
        val editItem = view.findViewById<EditText>(R.id.edit_item)
        editItem.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
//                Log.d(TAG, "afterTextChanged: ")
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
//                Log.d(TAG, "beforeTextChanged: ")
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
//                Log.d(TAG, "onTextChanged: ")
//                var EditString = "" + s
//                main_text.setText(EditString.length.toString())
//                Log.d(TAG, "editFlag = ${editFlag}")
//                if (EditString.length == 1 && editFlag == false) {
//                    val view = LayoutInflater.from(this@MainActivity).inflate(R.layout.data_item, null, false)
//                    layoutEdit.addView(view)
//                    editFlag = true
//                }else if(EditString.length == 0 && editFlag == true){
//                    layoutEdit.removeView(view)
//                    editFlag = false
//                }
            }
        })

        but_dal.setOnTouchListener(viewButton)
        but_dal.setOnClickListener {
//            layoutEdit.removeView(view)
            val view = LayoutInflater.from(this).inflate(R.layout.data_item, null, false)
            layoutEdit.addView(view)
        }

        //手指觸摸時的動作程式 (edit元件)
//        editItem.setOnTouchListener(object : View.OnTouchListener {
//            override fun onTouch(v: View?, event: MotionEvent?): Boolean {
//                when (event?.action) {
////                    MotionEvent.ACTION_DOWN ->      //手指觸碰螢幕時
//////                        val layoutEdit = findViewById<LinearLayout>(R.id.liner_layout)
//////                        val view = LayoutInflater.from(this@MainActivity).inflate(R.layout.data_item, null, false)
//////                        layoutEdit.addView(view)
////                        main_text.setText("OnTouch")
////                    MotionEvent.ACTION_UP ->        //手指離開螢幕時
////                        main_text.setText("TouchOut")
//                }
//
////                return v?.onTouchEvent(event) ?: true
//                return true
//            }
//        })

        //按鈕縮放動畫設定
//        but_dal.setOnTouchListener { v: View, event: MotionEvent? ->
//            when (event?.action) {
//                MotionEvent.ACTION_DOWN -> {    //MotionEvent是動作事件，要使用動作必須用MotionEvent指定
//                    but_dal.animate().scaleX(0.9f).setDuration(100).start()
//                    but_dal.animate().scaleY(0.9f).setDuration(100).start()
//                }
//                MotionEvent.ACTION_UP -> {
//                    but_dal.animate().scaleX(1.0f).setDuration(200).start()
//                    but_dal.animate().scaleY(1.0f).setDuration(200).start()
//                }
//            }
//            false
//        }
    }

    val viewButton = object: View.OnTouchListener{
        override fun onTouch(v: View?, event: MotionEvent?): Boolean {
            when(event?.action) {
                MotionEvent.ACTION_DOWN -> {
                    v?.animate()?.scaleX(0.9f)?.setDuration(100)?.start()
                    v?.animate()?.scaleY(0.9f)?.setDuration(100)?.start()
                }
                MotionEvent.ACTION_UP -> {
                    v?.animate()?.scaleX(1.0f)?.setDuration(200)?.start()
                    v?.animate()?.scaleY(1.0f)?.setDuration(200)?.start()
                }
            }
            return false
        }
    }

    fun itemData() {
        val layoutEdit = findViewById<LinearLayout>(R.id.liner_layout)  //定義元件要放的layout
        val view_1 = LayoutInflater.from(this@MainActivity).inflate(R.layout.data_item, null, false)
        val view_2 = LayoutInflater.from(this@MainActivity).inflate(R.layout.data_item, null, false)
        val view_3 = LayoutInflater.from(this@MainActivity).inflate(R.layout.data_item, null, false)
        val view_4 = LayoutInflater.from(this@MainActivity).inflate(R.layout.data_item, null, false)
        val view_5 = LayoutInflater.from(this@MainActivity).inflate(R.layout.data_item, null, false)
        val view_6 = LayoutInflater.from(this@MainActivity).inflate(R.layout.data_item, null, false)
        val view_7 = LayoutInflater.from(this@MainActivity).inflate(R.layout.data_item, null, false)
        val view_8 = LayoutInflater.from(this@MainActivity).inflate(R.layout.data_item, null, false)
        val view_9 = LayoutInflater.from(this@MainActivity).inflate(R.layout.data_item, null, false)
        val view_10 = LayoutInflater.from(this@MainActivity).inflate(R.layout.data_item, null, false)
        val view_11 = LayoutInflater.from(this@MainActivity).inflate(R.layout.data_item, null, false)
        val view_12 = LayoutInflater.from(this@MainActivity).inflate(R.layout.data_item, null, false)
        val view_13 = LayoutInflater.from(this@MainActivity).inflate(R.layout.data_item, null, false)
        val view_14 = LayoutInflater.from(this@MainActivity).inflate(R.layout.data_item, null, false)
        val view_15 = LayoutInflater.from(this@MainActivity).inflate(R.layout.data_item, null, false)

        layoutEdit.addView(view_1); layoutEdit.addView(view_2); layoutEdit.addView(view_3); layoutEdit.addView(view_4); layoutEdit.addView(view_5)
        layoutEdit.addView(view_6); layoutEdit.addView(view_7); layoutEdit.addView(view_8); layoutEdit.addView(view_9); layoutEdit.addView(view_10)
        layoutEdit.addView(view_11); layoutEdit.addView(view_12); layoutEdit.addView(view_13); layoutEdit.addView(view_14); layoutEdit.addView(view_15)

        val item_1 = view_1.findViewById<TextView>(R.id.tV_number)
        val item_2 = view_2.findViewById<TextView>(R.id.tV_number)
        val item_3 = view_3.findViewById<TextView>(R.id.tV_number)
        val item_4 = view_4.findViewById<TextView>(R.id.tV_number)
        val item_5 = view_5.findViewById<TextView>(R.id.tV_number)
        val item_6 = view_6.findViewById<TextView>(R.id.tV_number)
        val item_7 = view_7.findViewById<TextView>(R.id.tV_number)
        val item_8 = view_8.findViewById<TextView>(R.id.tV_number)
        val item_9 = view_9.findViewById<TextView>(R.id.tV_number)
        val item_10 = view_10.findViewById<TextView>(R.id.tV_number)
        val item_11 = view_11.findViewById<TextView>(R.id.tV_number)
        val item_12 = view_12.findViewById<TextView>(R.id.tV_number)
        val item_13 = view_13.findViewById<TextView>(R.id.tV_number)
        val item_14 = view_14.findViewById<TextView>(R.id.tV_number)
        val item_15 = view_15.findViewById<TextView>(R.id.tV_number)

        var itenList = mutableListOf(item_1, item_2, item_3, item_4, item_5, item_6,
            item_7, item_8, item_9, item_10, item_11, item_12, item_13, item_14, item_15)
//
        for (i in 0..14) {
            itenList[i].setText("${i+1}")
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