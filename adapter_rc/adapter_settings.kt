package com.slicingperlutukang.adapter_rc

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.slicingperlutukang.R

class adapter_settings(
    val listImg: List<Int>,
    val listJudul: List<String>
): RecyclerView.Adapter<adapter_settings.ViewHolder>(){
    class ViewHolder (view:View): RecyclerView.ViewHolder(view) {
        val img = view.findViewById<ImageView>(R.id.logo)
        val tv = view.findViewById<TextView>(R.id.JudulSettings)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): adapter_settings.ViewHolder {
        return adapter_settings.ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.adapter_settings, parent, false)
        )
    }

    override fun onBindViewHolder(holder: adapter_settings.ViewHolder, position: Int) {
        holder.img.setImageResource(listImg[position])
        if (position == listImg.size-1){
            holder.tv.setTextColor(Color.RED)
            holder.tv.text = listJudul[position]
        } else{
            holder.tv.text = listJudul[position]
        }

    }

    override fun getItemCount(): Int {
        return listImg.size
    }
}