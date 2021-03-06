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
        binding = FragmentContactListBinding.inflate(inflater, container, false)
        val adapter = ContactAdapter{
            val bundle = Bundle().apply {
                putString("phone",it.phone)
                putString("email",it.email)
                putString("address",it.address)
            }
            findNavController().navigate(R.id.action_contactListFragment_to_contactDetailFragment,bundle)
        }
        binding.contactRV.layoutManager = LinearLayoutManager(activity)
        binding.contactRV.adapter = adapter
        adapter.submitList(contactList)
        binding.addContact.setOnClickListener {
            findNavController().navigate(R.id.action_contactListFragment_to_addContactFragment)
        }
        return binding.root
    }
}