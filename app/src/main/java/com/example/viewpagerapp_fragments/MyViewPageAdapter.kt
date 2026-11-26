package com.example.viewpagerapp_fragments

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter



class MyViewPageAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle) :
    FragmentStateAdapter(fragmentManager, lifecycle) {

    /*
    val fragmentList = arrayListOf(
        Fragment1(),
        Fragment2(),
        Fragment3()
    )
     */


    /**
     * Questo metodo è responsabile della creazione e della restituzione di un fragment per una posizione specifica
     * crea una nuova istanza di un fragment in base al parametro position
     * @param position posizione della pagina da creare
     */
    override fun createFragment(position: Int): Fragment {
        //return fragmentList[position]

        return when (position){
            0 -> Fragment1()
            1 -> Fragment2()
            2 -> Fragment3()
            else -> Fragment1()
        }
    }

    override fun getItemCount(): Int {
      //  return fragmentList.size
       return 3
    }

    /*
    fun addFragment(fragment: Fragment) {
        //fragmentList.add(fragment)
    }
    */


}