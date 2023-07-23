package com.example.newmyshareapp

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView

class newadapter(var arr:ArrayList<String>):RecyclerView.Adapter<newadapter.viewholders>() {
    class viewholders(itemview: View):RecyclerView.ViewHolder(itemview) {
        var quotenumber=itemview.findViewById<TextView>(R.id.textView10)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewholders {
        var lay=LayoutInflater.from(parent.context).inflate(R.layout.allwriterview,parent, false)
        return viewholders(lay)
    }


    override fun getItemCount(): Int {
       return arr.size
    }

    override fun onBindViewHolder(holder: viewholders, position: Int) {
        var main=arr[position]
        holder.quotenumber.text=main

        }
    }
