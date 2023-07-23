package com.example.newmyshareapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment


class fragmenttoday: Fragment(R.layout.fragmenttoday) {


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val sharebtn=view.findViewById<Button>(R.id.button)

        sharebtn.setOnClickListener {
            val i= Intent(Intent.ACTION_SEND)
            i.putExtra(Intent.EXTRA_TEXT,"fyfgg")
            i.type="text/plain"
            startActivity(i)

        }
    }
}