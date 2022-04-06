package com.example.mycontactapp

data class Contacts(
    val name : String,
    val phone : String,
    val email : String,
    val address : String
)
val contactList = mutableListOf<Contacts>(
    Contacts("Pranto","01781100621","prantomondal517@gmail.com","Dhaka"),
    Contacts("Pranto","01781100621","prantomondal517@gmail.com","Dhaka"),
    Contacts("Pranto","01781100621","prantomondal517@gmail.com","Dhaka"),
    Contacts("Pranto","01781100621","prantomondal517@gmail.com","Dhaka"),
    Contacts("Pranto","01781100621","prantomondal517@gmail.com","Dhaka")
)
