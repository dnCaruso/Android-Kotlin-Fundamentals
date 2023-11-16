package com.example.convidadosapp.view.viewholder
import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.RecyclerView
import com.example.convidadosapp.model.GuestModel
import com.example.convidadosapp.view.listener.OnGuestListener
import com.example.convidadosapp.databinding.RowGuestBinding

class GuestViewHolder(private val bind: RowGuestBinding, private val listener: OnGuestListener) : RecyclerView.ViewHolder(bind.root) {

    fun bind(guest: GuestModel) {
        bind.textGuestName.text = guest.name

        bind.textGuestName.setOnClickListener {
            listener.OnClick(guest.id)
        }
        bind.textGuestName.setOnLongClickListener {

            AlertDialog.Builder(itemView.context)
                .setTitle("Remoção de Convidado")
                .setMessage("Tem certeza que deseja remover?")
                .setPositiveButton("Sim") { dialog, which -> listener.OnDelete(guest.id) }
                .setNegativeButton("Não", null)
                .create()
                .show()
            true
        }

    }


}