package com.slicingperlutukang.adapter_rc

import android.icu.text.CaseMap.Title
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import com.slicingperlutukang.R

class adapter_news_home(val ListImg : List<Int>)
    : RecyclerView.Adapter<adapter_news_home.ViewHolder>(){

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.adapter_rc_top_news, parent,false)
        )
    }
    override fun onBindViewHolder(holder: adapter_news_home.ViewHolder, position: Int) {
       holder.img.setImageResource(ListImg[position])
    }

    override fun getItemCount(): Int {
       return ListImg.size
    }
    class ViewHolder (itemView: View):RecyclerView.ViewHolder(itemView){
        val img = itemView.findViewById<ImageView>(R.id.img_news)
    }


}