package com.example.mycontactapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mycontactapp.databinding.FragmentContactListBinding


class ContactListFragment : Fragment() {
    private lateinit var binding: FragmentContactListBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentContactListBinding.inflate(inflater,container,false)
        val contactAdapter = ContactAdapter()
        binding.contactRV.layoutManager = LinearLayoutManager(requireActivity())
        binding.contactRV.adapter = contactAdapter

        contactAdapter.submitList(contactList)



        binding.fab.setOnClickListener {
            findNavController().navigate(R.id.action_contactListFragment_to_addContactFragment3)
        }
        return binding.root
    }


}