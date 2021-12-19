package com.example.homework24.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.homework24.R
import com.example.homework24.databinding.TopAlbumBinding
import java.util.ArrayList

class AlbumAdapter:RecyclerView.Adapter<AlbumAdapter.AlbumHolder>() {

    val albumList = ArrayList<AlbumItem>()


    class AlbumHolder(item: View) : RecyclerView.ViewHolder(item) {
        val binding = TopAlbumBinding.bind(item)
        fun bind(albumItem: AlbumItem) = with(binding) {
            imageJoy.setImageResource(albumItem.image)
            textTitle.text = albumItem.name
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AlbumHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.top_album, parent, false)
        return AlbumHolder(view)
    }

    override fun onBindViewHolder(holder: AlbumHolder, position: Int) {
        holder.bind(albumList[position])
    }

    override fun getItemCount(): Int {
        return albumList.size
    }

    private val imageIdList = listOf(
        AlbumItem("Wake Up songs", "R.drawable.img_3"),
        AlbumItem("Classic", "R.drawable.img_1"),
        AlbumItem("Guitar solo", "R.drawable.img_3")
    )

    fun addAll() {
        albumList.clear()
        albumList.addAll(imageIdList)
        notifyDataSetChanged()
    }

}

fun ImageView.setImageResource(image: String) {
    R.drawable.img_3
    R.drawable.img_1
    R.drawable.img_3
}


