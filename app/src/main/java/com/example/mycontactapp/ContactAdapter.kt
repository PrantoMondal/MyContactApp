package com.example.mycontactapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.mycontactapp.databinding.ContactRowBinding

class ContactAdapter(val callback: (Contacts) -> Unit): ListAdapter<Contacts, ContactAdapter.ContactViewHolder>(ContactDiffUtil()) {

    class ContactViewHolder(val binding: ContactRowBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(contact: Contacts){
            binding.contact = contact
        }
    }

    class ContactDiffUtil: DiffUtil.ItemCallback<Contacts>(){
        override fun areItemsTheSame(oldItem: Contacts, newItem: Contacts): Boolean {
            return oldItem.name == newItem.name
        }

        override fun areContentsTheSame(oldItem: Contacts, newItem: Contacts): Boolean {
            return oldItem == newItem
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        val binding = ContactRowBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        )
        return ContactViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        val contact = getItem(position)
        holder.bind(contact)

        holder.binding.showInfoIV.setOnClickListener {
            callback(contact)
        }
    }
}