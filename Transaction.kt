package com.slicingperlutukang

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.slicingperlutukang.adapter_rc.adapter_artikel_terbaru
import com.slicingperlutukang.adapter_rc.adapter_transaksi
import com.slicingperlutukang.R

class Transaction : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_transaksi, container, false)

        val recyclerView = view.findViewById<RecyclerView>(R.id.rc_Transaksi)
        rcListAnggota(recyclerView)

        Log.d("Transaksi", "RC KU MANA")

        return view
    }
    fun rcListAnggota(RecyclerView: RecyclerView){
        val list_image = listOf<Int>(
            R.drawable.avatar1,
            R.drawable.avatar2,
            R.drawable.avatar3,
            R.drawable.avatar4
        )
        val list_tanggal = listOf<String>(
            "26/04/2023",
            "28/07/2021",
            "29/12/2020",
            "26/09/2022"
        )
        val list_nama = listOf<String>(
            "Reynacho Radan",
            "Rex Celesta",
            "Prince Larez",
            "One and Only Reynn"
        )
        val list_jurusan = listOf<String>(
            "Rekayasa Perangkat Lunak",
            "Teknik Informasi",
            "Prince Larez",
            "Gold Laner Idaman"
        )
        val adapter_list = adapter_transaksi(list_image,list_nama,list_tanggal,list_jurusan)
        RecyclerView.adapter = adapter_list
    }

}

