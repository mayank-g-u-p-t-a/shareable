package com.example.newmyshareapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class viewadapter(var ar3:ArrayList<Datamodel>):RecyclerView.Adapter<viewadapter.viewholder>() {
    inner class viewholder(itemview:View):RecyclerView.ViewHolder(itemview){
        val writername=itemview.findViewById<TextView>(R.id.textView)
        val imagewri=itemview.findViewById<ImageView>(R.id.imageView)
        val quotename=itemview.findViewById<TextView>(R.id.tvquote)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewholder {
        var infl=LayoutInflater.from(parent.context).inflate(R.layout.itemviews,parent,false)
        return viewholder(infl)
    }

    override fun getItemCount(): Int {
        return ar3.size
    }

    override fun onBindViewHolder(holder: viewholder, position: Int) {
       var main=ar3[position]
        holder.imagewri.setImageResource(main.image)
        holder.writername.text=main.writername
        holder.quotename.text=main.wariterquote

    }
}