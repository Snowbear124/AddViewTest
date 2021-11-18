package com.snowbear.addviewtest



import android.app.usage.UsageEvents
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.MotionEvent
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.core.graphics.scaleMatrix


class MainActivity : AppCompatActivity() {
    val TAG = javaClass.simpleName
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val layoutEdit = findViewById<LinearLayout>(R.id.liner_layout)  //定義元件要放的layout
        val but_dal = findViewById<Button>(R.id.but_dal)
        val main_text = findViewById<TextView>(R.id.main_text)
        var itenList = mutableListOf<String>()

        //LayoutInflater必須把它放在可以觸發的位置，不然APP執行時會崩饋
        val view = LayoutInflater.from(this@MainActivity).inflate(R.layout.data_item, null, false)
        layoutEdit.addView(view)

        var editFlag = false
        var editcount = 0
        val editItem = view.findViewById<EditText>(R.id.edit_item)
        editItem.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
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

        but_dal.setOnClickListener {
            val view = LayoutInflater.from(this@MainActivity).inflate(R.layout.data_item, null, false)
            layoutEdit.addView(view)
        }

        //手指觸摸時的動作程式 (edit元件)
        editItem.setOnTouchListener(object : View.OnTouchListener {
            override fun onTouch(v: View?, event: MotionEvent?): Boolean {
                when (event?.action) {
//                    MotionEvent.ACTION_DOWN ->      //手指觸碰螢幕時
////                        val layoutEdit = findViewById<LinearLayout>(R.id.liner_layout)
////                        val view = LayoutInflater.from(this@MainActivity).inflate(R.layout.data_item, null, false)
////                        layoutEdit.addView(view)
//                        main_text.setText("OnTouch")
//                    MotionEvent.ACTION_UP ->        //手指離開螢幕時
//                        main_text.setText("TouchOut")
                }

//                return v?.onTouchEvent(event) ?: true
                return true
            }
        })

        //按鈕縮放動畫設定
        but_dal.setOnTouchListener(object: View.OnTouchListener{
            override fun onTouch(v: View?, event: MotionEvent?): Boolean {
                when(event?.action) {
                    MotionEvent.ACTION_DOWN -> {
                        but_dal.scaleX = 0.9f
                        but_dal.scaleY = 0.9f
                    }
                    MotionEvent.ACTION_UP -> {
                        but_dal.scaleX = 1f
                        but_dal.scaleY = 1f
                    }
                }
                return false
                //設定false就是讓Activity觸發此事件後，不做紀錄，讓其他事件可以觸發
                //true是讓Activity紀錄此事件後，並不再觸發其他事件
            }
        })

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

        but_dal.setOnTouchListener(viewButton)

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