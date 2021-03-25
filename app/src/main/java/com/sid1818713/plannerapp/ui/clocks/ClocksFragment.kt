package com.sid1818713.plannerapp.ui.clocks

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.sid1818713.plannerapp.R

class ClocksFragment : Fragment() {

    private lateinit var clocksViewModel: ClocksViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        clocksViewModel =
                ViewModelProvider(this).get(ClocksViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_clocks, container, false)
        val textView: TextView = root.findViewById(R.id.text_clocks)
        clocksViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}