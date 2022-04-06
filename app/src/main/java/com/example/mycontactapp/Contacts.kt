package com.example.mycontactapp

data class Contact(
    val id : Long,
    val name : String,
    val phone : String,
    val email : String,
    val address : String
)
val contactList = mutableListOf<Contact>(
    Contact(1,"Pranto","01781100621","prantomondal517@gmail.com","Dhaka"),
    Contact(2,"Pranto","01781100621","prantomondal517@gmail.com","Dhaka"),
    Contact(3,"Pranto","01781100621","prantomondal517@gmail.com","Dhaka"),
    Contact(4,"Pranto","01781100621","prantomondal517@gmail.com","Dhaka"),
    Contact(5,"Pranto","01781100621","prantomondal517@gmail.com","Dhaka")
)
