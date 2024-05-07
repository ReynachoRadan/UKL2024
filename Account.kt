package com.slicingperlutukang

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.slicingperlutukang.adapter_rc.adapter_artikel_terbaru
import com.slicingperlutukang.adapter_rc.adapter_settings
import com.slicingperlutukang.R

class Account : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_account, container, false)

        val rc_setting = view.findViewById<RecyclerView>(R.id.rcSettings)
        rcSetting(rc_setting)





        return view
    }

    fun rcSetting(RecyclerView: RecyclerView){
        val list_image = listOf<Int>(
            R.drawable.ic_change_password,
            R.drawable.ic_ketentuan_layanan,
            R.drawable.ic_kebijakan_layanan,
            R.drawable.wa,
            R.drawable.ic_keluar
        )
        val list_tv = listOf<String>(
            "Change Password",
            "Ketentuan Layanan",
            "Kebijakan Privasi",
            "Whatsapp Admin",
            "Keluar"
        )
        val adapter_list = adapter_settings(list_image,list_tv)
        RecyclerView.adapter = adapter_list
    }
}
