package com.example.recyclerviewexample2.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewexample2.R

class ContactAdapter(val contactList: ArrayList<Contact>): RecyclerView.Adapter<ContactViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        var  view= LayoutInflater.from(parent.context).inflate(R.layout.recycler_item,parent,false)
        return ContactViewHolder(view)
    }

    override fun getItemCount(): Int {
        return contactList.size
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        holder.picture.setImageResource(contactList[position].picture)
        holder.txtName.text=contactList[position].name
        holder.txtPhone.text=contactList[position].phone
    }
}

class ContactViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {
    var txtName: TextView =itemView.findViewById(R.id.txt_name)
    var txtPhone:TextView=itemView.findViewById(R.id.txt_phone)
    var picture: ImageView =itemView.findViewById(R.id.picture)
}