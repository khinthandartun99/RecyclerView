package com.example.recyclerviewexample2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewexample2.adapter.Contact
import com.example.recyclerviewexample2.adapter.ContactAdapter

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var contactRecycler: RecyclerView =findViewById(R.id.contact_recycler)
        contactRecycler.layoutManager= LinearLayoutManager(this)

        var contactList = ArrayList<Contact>()
        var contact:Contact
        contact=Contact("Nay Toe","09979760779",R.drawable.boy)
        contactList.add(contact)
        contact=Contact("Wutt Hmone Shwe Yi","0923456432",R.drawable.lady)
        contactList.add(contact)
        contact=Contact("Nay Toe","09456679999",R.drawable.men)
        contactList.add(contact)
        contact=Contact("Khin Wint Wah","09966789234",R.drawable.woman)
        contactList.add(contact)

        var contactAdapter= ContactAdapter(contactList)
        contactRecycler.adapter=contactAdapter
        }
    }

