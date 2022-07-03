package com.example.hw2

import android.content.Context
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.content.edit
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.hw2.R
import com.example.hw2.databinding.FragmentFirstBinding

class FirstFragment: Fragment(R.layout.first_fragment) {
    private var _binding: FragmentFirstBinding? = null
    private val binding get() = _binding!!
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FirstFragmentBinding.bind(view)

        with(binding) {
            btnFirst.setOnClickListener {
                findNavController().navigate(
                    R.id.action_firstFragment_to_templeFragment,
                    TempleFragment.createBundle("Место отправления"),
                )
            }
        }
    }

    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }
}