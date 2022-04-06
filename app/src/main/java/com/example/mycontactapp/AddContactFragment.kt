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
        if (cName.isEmpty()){
            Toast.makeText(activity,"Please Enter the Name",
                Toast.LENGTH_SHORT).show()
            return
        }
        val cNumber = binding.NumberInputET.text.toString()
        if (cNumber.isEmpty()){
            Toast.makeText(activity,"Please Enter the Number",
                Toast.LENGTH_SHORT).show()
            return
        }


        val cEmail = binding.EmailInputET.text.toString()
        if (cEmail.isEmpty()){
            Toast.makeText(activity,"Please Enter the Email",
                Toast.LENGTH_SHORT).show()
            return
        }
        val cAddress = binding.AddressInputET.text.toString()
        if (cAddress.isEmpty()){
            Toast.makeText(activity,"Please Enter the Address",
                Toast.LENGTH_SHORT).show()
            return
            val contact = Contacts(
                name = cName,
                phone = cNumber,
                email = cEmail,
                address = cAddress
            )
            contactList.add(contact)
            findNavController().navigate(R.id.action_contactListFragment_to_addContactFragment3)
        }

    }

}