package com.example.newmyshareapp

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class searchadapteer(var arra:ArrayList<writerData>):RecyclerView.Adapter<searchadapteer.viewholders>() {
    class viewholders(itemview: View):RecyclerView.ViewHolder(itemview) {
        var wimage=itemview.findViewById<ImageView>(R.id.imageView2)
        var wname=itemview.findViewById<TextView>(R.id.textView3)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewholders {
        val lay=LayoutInflater.from(parent.context).inflate(R.layout.writerview,parent,false)
return viewholders(lay)
    }

    override fun getItemCount(): Int {
        return arra.size
    }

    override fun onBindViewHolder(holder: viewholders, position: Int) {
        var main=arra[position]
holder.wimage.setImageResource(main.wimage)
        holder.wname.text=main.writername
holder.itemView.setOnClickListener {
val i=Intent(holder.itemView.context,writerquotes::class.java)
i.putExtra("writername1",main.writername)
    i.putExtra("writerimage",main.wimage)
holder.itemView.context.startActivity(i)
}
    }
}