package com.slicingperlutukang.adapter_rc
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.slicingperlutukang.R

class adapter_jasa_terdekat(
    val listTitle: List<String>,
    val listJarak: List<String>,
    val listAlamat: List<String>
): RecyclerView.Adapter<adapter_jasa_terdekat.ViewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return adapter_jasa_terdekat.ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.adapter_jasa_terdekat, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return listTitle.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.title.text = listTitle[position]
        holder.jarak.text = listJarak[position]
        holder.alamat.text = listAlamat[position]
    }

    class ViewHolder (view: View):RecyclerView.ViewHolder(view) {
        val title = view.findViewById<TextView>(R.id.Tempat)
        val jarak = view.findViewById<TextView>(R.id.jarak_distance)
        val alamat = view.findViewById<TextView>(R.id.alamat_addres)
    }

}