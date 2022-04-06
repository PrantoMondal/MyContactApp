package com.example.mycontactapp

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ListAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.mycontactapp.databinding.ContactRowBinding

class ContactAdapter:ListAdapter<Contacts,ContactAdapter.ContactViewHolder>(ContactDiffUtil()) {
    class ContactViewHolder(val binding: ContactRowBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(contacts: Contacts) {
            binding.contact = contacts
        }
    }

    class ContactDiffUtil : DiffUtil.ItemCallback<Contacts>() {
        override fun areItemsTheSame(oldItem: Contacts, newItem: Contacts): Boolean {
            return oldItem.name == newItem.name
        }

        override fun areContentsTheSame(oldItem: Contacts, newItem: Contacts): Boolean {
            return oldItem == newItem
        }
    }

    fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        val binding = ContactRowBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        )
        return ContactViewHolder(binding)
    }
}