package com.example.newmyshareapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintSet.Layout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class writerquotes : AppCompatActivity() {
    private val categorylist=ArrayList<String>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_writerquotes)
        val writrimage=intent.getIntExtra("writerimage",0)
        val writename=intent.getStringExtra("writername1").toString()
        val textwname=findViewById<TextView>(R.id.textView9)
        textwname.setText(writename)
        val wriimage=findViewById<ImageView>(R.id.imageView3)
        wriimage.setImageResource(writrimage)

        categorylist.add("East or West home is best")
        categorylist.add("Sun mere humsafar kya rtuzhe itne si khabar")
        categorylist.add("East or West home is best")
        categorylist.add("If you do this than i will do that")
        categorylist.add("blah blah blah")
        categorylist.add("Oh antava oh antava")
        categorylist.add("blah blah blah")
        val rv=findViewById<RecyclerView>(R.id.ke)
rv.layoutManager=LinearLayoutManager(this)
rv.adapter=newadapter(categorylist)
    }
}