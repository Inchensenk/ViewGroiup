package com.example.viewgroup

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.viewgroup.adapter.EventAdapter
import com.example.viewgroup.event.EventGenerator


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val eventsRecycler: RecyclerView = findViewById(R.id.eventsRecycler)
        val eventsAdapter = EventAdapter()

        eventsRecycler.layoutManager = LinearLayoutManager(this)
        eventsRecycler.adapter = eventsAdapter

        eventsAdapter.data = EventGenerator.generateEvents(50)
    }
}