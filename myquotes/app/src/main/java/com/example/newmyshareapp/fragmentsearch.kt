package com.example.newmyshareapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView


class fragmentsearch: Fragment(R.layout.fragmentsearch) {
    private val writerimagelist=ArrayList<writerData>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragmentsearch,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        writerimagelist.add(writerData(R.drawable.ic_launcher_foreground,"Albert Einstie"))
        writerimagelist.add(writerData(R.drawable.ic_launcher_foreground,"Albert Einstie"))
        writerimagelist.add(writerData(R.drawable.baseline_person_24,"Albert Einstie"))
        writerimagelist.add(writerData(R.drawable.baseline_person_24,"Albert Einstie"))
        writerimagelist.add(writerData(R.drawable.baseline_person_24,"Albert Einstie"))
        writerimagelist.add(writerData(R.drawable.baseline_person_24,"Albert Einstie"))
        writerimagelist.add(writerData(R.drawable.ic_launcher_foreground,"Albert Einstie"))
        writerimagelist.add(writerData(R.drawable.baseline_person_24,"Albert Einstie"))
        writerimagelist.add(writerData(R.drawable.baseline_person_24,"Albert Einstie"))
        writerimagelist.add(writerData(R.drawable.baseline_person_24,"Albert Einstie"))
        writerimagelist.add(writerData(R.drawable.baseline_person_24,"Albert Einstie"))
        writerimagelist.add(writerData(R.drawable.baseline_person_24,"Albert Einstie"))
        writerimagelist.add(writerData(R.drawable.baseline_person_24,"Ravan"))
        writerimagelist.add(writerData(R.drawable.baseline_person_24,"Albert Einstie"))

        var rv =view.findViewById<RecyclerView>(R.id.recyclerView)
        rv.layoutManager=GridLayoutManager(requireContext(),3)
        rv.adapter=searchadapteer(writerimagelist)
        rv.setHasFixedSize(true)

    }

}