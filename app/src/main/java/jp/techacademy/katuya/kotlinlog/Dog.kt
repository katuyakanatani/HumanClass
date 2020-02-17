package jp.techacademy.katuya.kotlinlog

import android.util.Log

open class Dog: Animal {

    constructor(name: String, age: Int): super(name, age){
    }

    override fun say() {
        Log.d("kotlintest", this.name + "(" + this.age + "歳)" + "｢ワンワン」")
    }
}