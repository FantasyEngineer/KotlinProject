package com.hjg.kotlin

import android.icu.lang.UCharacter.GraphemeClusterBreak.L
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import kotlin.math.log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val i: Int = 6;
        val b1 = i.toByte()


        //注意：由于Kotlin是强类型的，因此编译器通常可以推断变量的类型，因此您无需显式声明它。
//        为了使长数值常量更具可读性，Kotlin允许您在数字中加上下划线
        val oneMillion = 1_000_000


        var name = "侯继国";

        var textView = findViewById<TextView>(R.id.textView)

//        var fish = 1
//        fish = 2
//        val aquarium = 1
//        aquarium = 2 //val 修饰的变量不可变

//        定义一些变量并显式指定类型。

        var fish: Int = 12
        var lakes: Double = 2.5

        textView.text = name + "双字符串增加$fish$lakes"
        textView.text = name + "${fish + lakes}"

        //in的用法
        val fish1 = 1000
        if (fish1 in 1..100) {
            textView.text = "fish1在1-100以内啊"
        }

        //when的用法

        when (fish1) {
            0 -> textView.text = "这里是0"
            in 1..100 -> textView.text = "这里是1-100"
            else -> textView.text = "其他"
        }


//        默认情况下，变量不能为null。
        var name1 = null;


        var age: String? = null;


    }
}