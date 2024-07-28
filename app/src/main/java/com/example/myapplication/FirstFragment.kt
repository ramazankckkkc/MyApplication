package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.myapplication.databinding.FragmentFirstBinding


class FirstFragment : Fragment() {
private  var _binding:FragmentFirstBinding?=null;
    private val binding get()=_binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        val view = binding.root
        return view    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.button.setOnClickListener{
            sonraki(it)
        }
    }
    fun sonraki(view: View){
        val isim =binding.editTextText.text.toString()
val action=FirstFragmentDirections.actionFirstFragmentToSecondFragment(isim)
        Navigation.findNavController(view).navigate(action)
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}