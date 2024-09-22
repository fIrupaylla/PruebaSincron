package dev.fiorellairupaylla.fragmentslab06.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import dev.fiorellairupaylla.fragmentslab06.R
import dev.fiorellairupaylla.fragmentslab06.ui.model.SongModel

class SongAdapter(private var lstSong: List<SongModel>)
    : RecyclerView.Adapter<SongAdapter.ViewHolder>() {

        class  ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
            val ivSong = itemView.findViewById<ImageView>(R.id.ivSong)
            val tvSong = itemView.findViewById<TextView>(R.id.tvSong)
            val tvAlbum = itemView.findViewById<TextView>(R.id.tvAlbum)
            val tvNumberPlay = itemView.findViewById<TextView>(R.id.tvNumber)
            val tvDuration = itemView.findViewById<TextView>(R.id.tvDuration)

        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layaoutInflater = LayoutInflater.from(parent.context)
        return ViewHolder(layaoutInflater.inflate(R.layout.item_musica, parent, false))
    }

    override fun getItemCount(): Int {
        return lstSong.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val itemSong = lstSong[position]
        holder.ivSong.setImageResource(itemSong.image)
        holder.tvSong.text = itemSong.songName
        holder.tvAlbum.text = itemSong.album
        holder.tvNumberPlay.text = itemSong.numberPlay
        holder.tvDuration.text = itemSong.duration
    }


}