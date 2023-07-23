package com.example.newmyshareapp

import android.Manifest
import android.annotation.SuppressLint
import android.app.AlarmManager
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.graphics.Color
import android.os.Build
import android.os.Bundle
import android.text.TextUtils.replace
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import androidx.core.content.ContextCompat.getSystemService
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import java.io.BufferedReader
import java.util.*


class MainActivity : AppCompatActivity() {
    val channelid="channelid"
    val channelname="channelname"
    val notificationid=0
    @SuppressLint("ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val fragmenttoday = fragmenttoday()
        val fragmentsearch = fragmentsearch()
        val fragmenthome = fragmenthome()
        val fragmentviewa = fragmentviewa()

        supportActionBar?.hide()


        val bottomNavigationView: BottomNavigationView = findViewById(R.id.bottomNavigationView)
        bottomNavigationView.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.today -> setfragment(fragmenttoday)
                R.id.search -> setfragment(fragmentsearch)
                R.id.profile -> setfragment(fragmenthome)
                R.id.view -> setfragment(fragmentviewa)

            };true
        }


    }



    private fun setfragment(fragment: Fragment)=supportFragmentManager.beginTransaction().apply {
        replace(R.id.ffragment,fragment)
        commit()
    }

        }


