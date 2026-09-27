package com.example.mycourse

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast

class MateriFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_materi, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.btn_materi_1)?.setOnClickListener {
            Toast.makeText(requireContext(), "Materi OOP", Toast.LENGTH_SHORT).show()
        }
        view.findViewById<Button>(R.id.btn_materi_2)?.setOnClickListener {
            Toast.makeText(requireContext(), "Materi Android", Toast.LENGTH_SHORT).show()
        }
        view.findViewById<Button>(R.id.btn_materi_3)?.setOnClickListener {
            Toast.makeText(requireContext(), "Materi Intent", Toast.LENGTH_SHORT).show()
        }
    }
}