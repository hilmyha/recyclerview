package com.example.recycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var rvSekolah: RecyclerView
    private var list: ArrayList<Sekolah> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvSekolah = findViewById(R.id.rv_sekolah)
        rvSekolah.setHasFixedSize(true)

        list.addAll(DataSekolah.listData)
//        showRecyclerList()
//        showRecyclerGrid()
        showRecyclerCardView()
    }

    private fun showRecyclerList() {
        rvSekolah.layoutManager = LinearLayoutManager(this)
        val listSekolahAdapter = ListSekolahAdapter(list)
        rvSekolah.adapter = listSekolahAdapter
    }

    private fun showRecyclerGrid() {
        rvSekolah.layoutManager = LinearLayoutManager(this)
        val gridSekolahAdapter = GridSekolahAdapter(list)
        rvSekolah.adapter = gridSekolahAdapter
    }

    private fun showRecyclerCardView() {
        rvSekolah.layoutManager = LinearLayoutManager(this)
        val cardSekolahAdapter = CardSekolahAdapter(list)
        rvSekolah.adapter = cardSekolahAdapter
    }
}