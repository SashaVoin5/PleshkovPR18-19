package com.example.pleshkovpr18_19

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.MenuItem
import android.view.Menu


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // TODO Auto-generated method stub
        // добавляем пункты меню
        menuInflater.inflate(R.menu.menu, menu)
        return super.onCreateOptionsMenu(menu)
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // TODO Auto-generated method stub
        var intent: Intent? = null
        intent = when (item.itemId) {
            R.id.m1 -> Intent(this, history::class.java)
            R.id.m2 -> Intent(this, i74770::class.java)
            R.id.m3 -> Intent(this, i76700::class.java)
            R.id.m4 -> Intent(this, i77700::class.java)
            R.id.m5 -> Intent(this, i78700::class.java)
            R.id.m6 -> Intent(this, i79700::class.java)
            R.id.m7 -> Intent(this, i710700::class.java)
            else -> return super.onOptionsItemSelected(item)
        }
        startActivity(intent)
        return super.onOptionsItemSelected(item)
    }
}