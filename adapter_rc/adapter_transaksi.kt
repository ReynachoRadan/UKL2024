package com.slicingperlutukang.adapter_rc

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.slicingperlutukang.R

class adapter_transaksi(
    val listAvatar : List<Int>,
    val listNama: List<String>,
    val listTanggal: List<String>,
    val listJurusan: List<String>
): RecyclerView.Adapter<adapter_transaksi.ViewHolder>() {
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view){
        val avatar = view.findViewById<ImageView>(R.id.avatar)
        val nama = view.findViewById<TextView>(R.id.nama)
        val tanggal = view.findViewById<TextView>(R.id.tanggal)
        val jurusan = view.findViewById<TextView>(R.id.jurusan)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
       return adapter_transaksi.ViewHolder(
           LayoutInflater.from(parent.context).inflate(R.layout.adapter_transaksi, parent, false)
       )
    }

    override fun getItemCount(): Int {
       return listJurusan.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.nama.text = listNama[position]
        holder.tanggal.text = listTanggal[position]
        holder.jurusan.text = listJurusan[position]
        holder.avatar.setImageResource(listAvatar[position])
    }
}