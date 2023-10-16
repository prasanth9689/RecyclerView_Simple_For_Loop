package com.skyblue.recyclerviewinkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.skyblue.recyclerviewinkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.recyclerview.layoutManager = LinearLayoutManager(this)
        val data = ArrayList<Items>()

        for (i in 1..20){
            data.add(Items(R.drawable.ic_launcher_foreground, "Items" + i))
        }
        val adapter = CustomAdapter(data);

        binding.recyclerview.adapter = adapter
    }
}