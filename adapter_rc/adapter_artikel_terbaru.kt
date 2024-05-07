package com.slicingperlutukang.adapter_rc

import android.icu.text.CaseMap.Title
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.slicingperlutukang.R

class adapter_artikel_terbaru(
    val listImg : List<Int>,
    val listTitle: List<String>
) : RecyclerView.Adapter<adapter_artikel_terbaru.ViewHolder>(){
    class ViewHolder (view: View) : RecyclerView.ViewHolder(view){
        val img = view.findViewById<ImageView>(R.id.img_artikel)
        val title = view.findViewById<TextView>(R.id.tv_artikel)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return adapter_artikel_terbaru.ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.adapter_artikel_terbaru, parent, false)
        )
    }

    override fun onBindViewHolder(holder: adapter_artikel_terbaru.ViewHolder, position: Int) {
        holder.img.setImageResource(listImg[position])
        holder.title.text = listTitle[position]
    }

    override fun getItemCount(): Int {
        return listTitle.size
    }

}