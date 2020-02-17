package jp.techacademy.katuya.kotlinlog

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dog = Dog("poti", 3)

        dog.say()
        Log.d("kotlintest", "犬のなまえは" + dog.name + "です。")
        Log.d("kotlintest", "犬の年齢は" + dog.age + "です。")

        val bigdog = BigDog("nora",10)
        Log.d("kotlintest", "犬の名前は" + bigdog.name + "です。")
        Log.d("kotlintest", "犬の年齢は" + bigdog.age + "歳です。")

        val human = Human("人", 24, "疲れ")
        human.say()
        human.think()

        val human2 = Human("人人", 25, "睡眠")
        human2.say()
        human2.think()
    }
}
