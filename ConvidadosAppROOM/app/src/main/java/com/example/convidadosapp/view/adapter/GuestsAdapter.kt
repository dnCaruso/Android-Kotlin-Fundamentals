package com.example.convidadosapp.view.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.convidadosapp.model.GuestModel
import com.example.convidadosapp.view.listener.OnGuestListener
import com.example.convidadosapp.view.viewholder.GuestViewHolder
import com.example.convidadosapp.databinding.RowGuestBinding

class GuestsAdapter : RecyclerView.Adapter<GuestViewHolder>() {

    private lateinit var listener: OnGuestListener
    private var guestList: List<GuestModel> = listOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GuestViewHolder {
        val item = RowGuestBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return GuestViewHolder(item, listener)
    }

    override fun onBindViewHolder(holder: GuestViewHolder, position: Int) {
        holder.bind(guestList[position])
    }

    override fun getItemCount(): Int {
        return guestList.count()
    }

    fun updatedGuests(list: List<GuestModel>) {
        guestList = list
        notifyDataSetChanged()
    }

    fun attachListener(guestListener : OnGuestListener) {
        listener = guestListener
    }
}