package com.example.mycontactapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.example.mycontactapp.databinding.FragmentAddContactBinding


class AddContactFragment : Fragment() {
    private lateinit var binding:FragmentAddContactBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAddContactBinding.inflate(inflater,container,false)

        binding.saveBtn.setOnClickListener {
            saveinfo()
        }

        return binding.root
    }

    private fun saveinfo() {
        val cName = binding.NameInputET.text.toString()
        val cNumber = binding.NumberInputET.text.toString()
        val cEmail = binding.EmailInputET.text.toString()
        val cAddress = binding.AddressInputET.text.toString()


        val contact = Contact(
            id = System.currentTimeMillis(),
            name = cName,
            phone = cNumber,
            email = cEmail,
            address = cAddress
        )
        contactList.add(contact)
        findNavController().navigate(R.id.action_contactListFragment_to_addContactFragment)
    }

}

