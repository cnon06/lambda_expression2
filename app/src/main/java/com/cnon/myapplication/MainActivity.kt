package com.cnon.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        /*
        Lambda expressionların değişik şekillerde ifade edilişleri
         */


        val lambda_fonksiyon_toplam = { a: Int, b: Int -> "$a ve $b nin toplamı: ${a+b}"}
        val lambda_fonksiyon_cikarma = { a: Int, b: Int -> "$a den $b eksilirse: ${a-b}" }
        val lambda_fonksiyon_carpma = { a: Int, b: Int -> "$a ve $b çarpılırsa: ${a*b}" }
        val lambda_fonksiyon_bolme = { a: Int, b: Int -> "$a,  $b ye bölünürse: ${a/b.toDouble()}" }


        sonuc(4,6,lambda_fonksiyon_toplam)
        sonuc(4,6,lambda_fonksiyon_carpma)
        sonuc(4,6,lambda_fonksiyon_bolme)
        sonuc(4,6,lambda_fonksiyon_cikarma)

        println("........................................................")
        sonuc(4,6,{ a: Int, b: Int -> "$a ve $b nin toplamı: ${a+b}" })
        sonuc(4,6,{ a: Int, b: Int -> "$a den $b eksilirse: ${a-b}" })
        sonuc(4,6,{ a: Int, b: Int -> "$a ve $b çarpılırsa: ${a*b}" })
        sonuc(4,6,{ a: Int, b: Int -> "$a,  $b ye bölünürse: ${a/b.toDouble()}" })

        println("........................................................")
        sonuc(4,6){ a: Int, b: Int -> "$a ve $b nin toplamı: ${a+b}" }
        sonuc(4,6){ a: Int, b: Int -> "$a den $b eksilirse: ${a-b}" }
        sonuc(4,6){ a: Int, b: Int -> "$a ve $b çarpılırsa: ${a*b}" }
        sonuc(4,6){ a: Int, b: Int -> "$a,  $b ye bölünürse: ${a/b.toDouble()}" }



        println("...........................................")

        val terso = { duz:String -> duz.reversed()}

        println(stringIsle("sinan",terso))
        println(stringIsle("suzan") { duz: String -> duz.reversed() })
        println(stringIsle("sinem", String::reversed))
        println(stringIsle("suzan") { duz: String -> duz.length.toString() })
        println(stringIsle("alagöz") { it.length.toString() }) // sadece tek parametreli fonksiyonlarda kullanılabilir.





    }




    fun stringIsle (yazi:String, tersle: (String) -> String) :String
    {
        return tersle(yazi)
    }

    fun sonuc (sayi1: Int, sayi2: Int, action: (Int, Int) -> String)
    {
        val sonuc = action(sayi1,sayi2)
        println(sonuc)
    }
}