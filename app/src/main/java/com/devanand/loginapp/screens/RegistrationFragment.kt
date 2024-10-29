package com.devanand.loginapp.screens

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.devanand.loginapp.R
import com.devanand.loginapp.databinding.FragmentRegistrationBinding

class RegistrationFragment : Fragment() {

    private lateinit var binding : FragmentRegistrationBinding
    lateinit var name : String

    override fun onAttach(context: Context) {
        Log.e("Fragment B - ", "onAttach: ")
        super.onAttach(context)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.e("Fragment B - ", "onCreate: ")
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentRegistrationBinding.inflate(inflater,container,false)
        Log.e("Fragment B - ", "onCreateView: ")
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.e("Fragment B - ", "onViewCreated: ")
        binding.btnSignUp.setOnClickListener {
            findNavController().navigate(R.id.action_registrationFragment_to_loginFragment)
        }
    }

    override fun onStart() {
        Log.e("Fragment B - ", "onStart: ")
        super.onStart()
    }

    override fun onResume() {
        Log.e("Fragment B - ", "onResume: ")
        super.onResume()
    }

    override fun onPause() {
        Log.e("Fragment B - ", "onPause: ")
        super.onPause()
    }

    override fun onStop() {
        Log.e("Fragment B - ", "onStop: ")
        super.onStop()
    }

    override fun onDestroyView() {
        Log.e("Fragment B - ", "onDestroyView: ")
        super.onDestroyView()
    }

    override fun onDestroy() {
        Log.e("Fragment B - ", "onDestroy: ")
        super.onDestroy()
    }

    override fun onDetach() {
        Log.e("Fragment B - ", "onDetach: ")
        super.onDetach()
    }

}