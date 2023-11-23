package com.dasadarsa.edusmart.chat.adapter

import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.dasadarsa.edusmart.R
import com.dasadarsa.edusmart.chat.`interface`.ChatInterface
import com.dasadarsa.edusmart.chat.data.Chat
import com.dasadarsa.edusmart.chat.fragment.ChatA1Fragment
import com.dasadarsa.edusmart.chat.fragment.ChatFragment

class RecyclerViewChatAdapter constructor(private val chatInterface: ChatInterface, private val chatList: List<Chat>) :
    RecyclerView.Adapter<RecyclerViewChatAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.layout_chat_list_item, parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return chatList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.tvChatTitle.text = chatList[position].title
        holder.ivChatImg.setImageResource(chatList[position].image)


        holder.cardView.setOnClickListener {
            chatInterface.openWhatsApp()

//            val fragmentTransaction = getActivity.parentFragmentManager.beginTransaction()
//            val targetFragment = ChatA1Fragment()
//            fragmentTransaction.replace(R.id.fragment_container, targetFragment)
//            fragmentTransaction.addToBackStack(null)
//            fragmentTransaction.commit()
        }

//        holder.cardView.setOnClickListener {
//            Toast.makeText(getActivity, scoreList[position].title, Toast.LENGTH_LONG).show()
//        }
    }


    class MyViewHolder(itemView : View)  : RecyclerView.ViewHolder(itemView){
        val tvChatTitle : TextView = itemView.findViewById(R.id.tv_ChatTitle)
        val ivChatImg : ImageView = itemView.findViewById(R.id.ivChatImg)
        val cardView : CardView = itemView.findViewById(R.id.cardView)
    }
}