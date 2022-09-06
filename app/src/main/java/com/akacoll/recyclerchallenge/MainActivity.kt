package com.akacoll.recyclerchallenge

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.akacoll.recyclerchallenge.components.MusicAdapter
import com.akacoll.recyclerchallenge.data.musicList
import com.akacoll.recyclerchallenge.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        setupMusicAdapter()

        setContentView(binding.root)
    }

    private fun setupMusicAdapter() {
        binding.apply {
            val musicAdapter = MusicAdapter(musicList)
            rvMusic.layoutManager =
                LinearLayoutManager(baseContext, LinearLayoutManager.VERTICAL, false)
            rvMusic.adapter = musicAdapter
        }

    }
}