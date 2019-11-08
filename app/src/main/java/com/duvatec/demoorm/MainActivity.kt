package com.duvatec.demoorm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.activeandroid.query.Select
import com.duvatec.demoorm.models.MJCatalog
import com.duvatec.demoorm.models.MKCatalog


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val objJava = MJCatalog()
        objJava.name = "Mi nombre Java"
        objJava.save()

        val objKotlin = MKCatalog()
        objKotlin.name = "Mi nombre Kotlin"
        objKotlin.save()

        Log.e("***", "****Aqui se muestra el query***")
        Log.e("ObjJava", getJavaObj().name)
        Log.e("ObjKotlin", getKotlinObj().name)


    }

    fun getJavaObj(): MJCatalog {
        return Select().from(MJCatalog::class.java).executeSingle()
    }

    fun getKotlinObj(): MKCatalog {
        return Select().from(MKCatalog::class.java).executeSingle()
    }
}
