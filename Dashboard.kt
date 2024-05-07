package com.slicingperlutukang

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.slicingperlutukang.adapter_rc.adapter_artikel_terbaru
import com.slicingperlutukang.R
import com.slicingperlutukang.adapter_rc.adapter_jasa_terdekat
import com.slicingperlutukang.adapter_rc.adapter_news_home


class Dashboard : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_dashboard, container, false)

        val rc_news = view.findViewById<RecyclerView>(R.id.rc_top_news)
        rcNews(rc_news)

        val rc_jasa_terdekat = view.findViewById<RecyclerView>(R.id.rc_jarak_terdekat)
        rcJasaTerdekat(rc_jasa_terdekat)

        val rc_artikel_terbaru = view.findViewById<RecyclerView>(R.id.rcArtikelTerbaru)
        rcArtikelTerbaru(rc_artikel_terbaru)





        return view
    }

    fun rcNews(RecyclerView: RecyclerView){
        val list_image = listOf<Int>(
            R.drawable.news1,
            R.drawable.news2,
            R.drawable.news3,
            R.drawable.news4
        )
        val adapter_list_image = adapter_news_home(list_image)
        RecyclerView.adapter = adapter_list_image
    }
    fun rcJasaTerdekat(RecyclerView: RecyclerView){
        val list_title = listOf<String>(
            "Service Laptop Malang",
            "PietComp",
            "SMK Telkom Malang",
        )
        val list_jarak = listOf<String>(
            " (6,7 KM)",
            " (8,7 KM)",
            " (11,2 KM)",
        )
        val list_Alamat = listOf<String>(
            "Jl. Gajayana, Ketawanggede, Kec. Lowokwaru, Kota Malang",
            "Jl. Jalan ke kota bandung naik pesawat 2 jam perjalanan",
            "Jl. Danau Kerinci paling kalo gasalah lagi",
        )
        val adapter_list = adapter_jasa_terdekat(list_title,list_jarak,list_Alamat)
        RecyclerView.adapter = adapter_list
    }
    fun rcArtikelTerbaru(RecyclerView: RecyclerView){
        val list_image = listOf<Int>(
            R.drawable.news2,
            R.drawable.news4,
            R.drawable.news1,
            R.drawable.news3,
        )
        val list_tv = listOf<String>(
            "Update Top Global Harith",
            "Update Gold Laner Idaman",
            "Develope by Reynacho Radan XI RPL 4",
            "Rex Celesta XI RPL 4"
        )
        val adapter_list = adapter_artikel_terbaru(list_image,list_tv)
        RecyclerView.adapter = adapter_list
    }
}
