package com.example.newmyshareapp

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.core.view.ViewCompat
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class fragmentviewa: Fragment(R.layout.fragmentview) {
private val listvi=ArrayList<Datamodel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragmentview, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        listvi.add(Datamodel(R.drawable.ic_launcher_foreground,"Myself","Home is best place to live"))
        listvi.add(Datamodel(R.drawable.ic_launcher_foreground,"Myself","Home is best place to live"))
        listvi.add(Datamodel(R.drawable.ic_launcher_foreground,"Myself","Home is best place to live"))
        listvi.add(Datamodel(R.drawable.ic_launcher_foreground,"Myself","Home is best place to live"))
        listvi.add(Datamodel(R.drawable.ic_launcher_foreground,"Myself","Home is best place to live"))
        listvi.add(Datamodel(R.drawable.ic_launcher_foreground,"Myself","Home is best place to live"))
        listvi.add(Datamodel(R.drawable.ic_launcher_foreground,"Myself","Home is best place to live"))
        listvi.add(Datamodel(R.drawable.ic_launcher_foreground,"Myself","Home is best place to live"))
        var rv=view.findViewById<RecyclerView>(R.id.j)
        rv.layoutManager=LinearLayoutManager(requireContext())
        rv.adapter=viewadapter(listvi)




    }

    }

