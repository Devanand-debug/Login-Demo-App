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
import com.devanand.loginapp.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {

    private lateinit var binding : FragmentLoginBinding

    override fun onAttach(context: Context) {
        Log.e("Fragment A - ", "onAttach: ")
        super.onAttach(context)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.e("Fragment A - ", "onCreate: ")
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLoginBinding.inflate(inflater,container,false)

        Log.e("Fragment A - ", "onCreateView: ")

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.e("Fragment A - ", "onViewCreated: ")

        binding.btnLogin.setOnClickListener {
            findNavController().navigate(R.id.action_loginFragment_to_registrationFragment)
        }
    }

    override fun onStart() {
        Log.e("Fragment A - ", "onStart: ")
        super.onStart()
    }

    override fun onResume() {
        Log.e("Fragment A - ", "onResume: ")
        super.onResume()
    }

    override fun onPause() {
        Log.e("Fragment A - ", "onPause: ")
        super.onPause()
    }

    override fun onStop() {
        Log.e("Fragment A - ", "onStop: ")
        super.onStop()
    }

    override fun onDestroyView() {
        Log.e("Fragment A - ", "onDestroyView: ")
        super.onDestroyView()
    }

    override fun onDestroy() {
        Log.e("Fragment A - ", "onDestroy: ")
        super.onDestroy()
    }

    override fun onDetach() {
        Log.e("Fragment A - ", "onDetach: ")
        super.onDetach()
    }

}