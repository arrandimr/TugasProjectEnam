package com.example.tugasprojectenam

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.list_jajanan.view.*

class AdapterJajanan (val jajanItemList: List<DataJajanan>, val clickListener: (DataJajanan) -> Unit) :
        RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.list_jajanan,parent, false)
        return PartViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as PartViewHolder).bind(jajanItemList[position],clickListener)
    }

    override fun getItemCount() = jajanItemList.size

    class PartViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(jajan: DataJajanan, clickListener: (DataJajanan) -> Unit) {
            itemView.nama_jajan.text = jajan.nama
            itemView.desc_jajan.text = jajan.desc
            itemView.gambar_jajan.setImageResource(jajan.gambar)
            itemView.setOnClickListener { clickListener(jajan)}
        }
    }
}