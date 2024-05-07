package com.slicingperlutukang

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import com.slicingperlutukang.databinding.ActionBarBinding
import com.slicingperlutukang.databinding.ActivityMainBinding


class ActionBar : AppCompatActivity(){

    private lateinit var binding: ActionBarBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.action_bar)
        binding= ActionBarBinding.inflate(layoutInflater)
        setContentView(binding.root)
        replaceFragment(Dashboard())

        binding.BottomNavigation.setOnItemSelectedListener {


            when(it.itemId){

                R.id.rawr1-> replaceFragment(Dashboard())
                R.id.rawr2-> replaceFragment(Transaction())
                R.id.rawr3-> replaceFragment(Maintenance())
                R.id.rawr4-> replaceFragment(Maintenance())
                R.id.rawr5-> replaceFragment(Account())

                else->{


                }
            }
            true
        }


        }



        private fun replaceFragment(fragment: Fragment){

            val fragmentManager = supportFragmentManager
            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragment_container,fragment)
            fragmentTransaction.commit()
        }
    }
