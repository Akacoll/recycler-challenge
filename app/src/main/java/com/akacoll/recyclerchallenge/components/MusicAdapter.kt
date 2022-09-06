package com.akacoll.recyclerchallenge.components

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.akacoll.recyclerchallenge.data.Music
import com.akacoll.recyclerchallenge.databinding.MusicitemBinding

class MusicAdapter(
    private val musicList: List<Music>
) : RecyclerView.Adapter<MusicAdapter.MusicViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MusicViewHolder {
        val binding = MusicitemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MusicViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MusicViewHolder, position: Int) {
        with(holder) {
            with(musicList[position]) {
                binding.tvTitle.text = title
                binding.tvAuthor.text = author
            }
        }
    }

    override fun getItemCount() = musicList.size

    inner class MusicViewHolder(var binding: MusicitemBinding) :
        RecyclerView.ViewHolder(binding.root)
}