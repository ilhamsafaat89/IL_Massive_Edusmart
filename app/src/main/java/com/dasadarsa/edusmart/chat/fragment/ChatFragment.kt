package com.dasadarsa.edusmart.chat.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.dasadarsa.edusmart.R
import com.dasadarsa.edusmart.chat.adapter.RecyclerViewChatAdapter
import com.dasadarsa.edusmart.chat.data.Chat

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [ChatFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ChatFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null
    private var recyclerView : RecyclerView? = null
    private var recyclerViewChatAdapter : RecyclerViewChatAdapter? = null
    private var chatList = mutableListOf<Chat>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val v = inflater.inflate(R.layout.fragment_chat, container, false)

        chatList = ArrayList()

        recyclerView = v.findViewById<View>(R.id.rvChatList) as RecyclerView
        recyclerViewChatAdapter = RecyclerViewChatAdapter(this@ChatFragment, chatList)
        val  layoutManager : RecyclerView.LayoutManager = LinearLayoutManager(context)
        recyclerView!!.layoutManager = layoutManager
        recyclerView!!.adapter = recyclerViewChatAdapter

        prepareChatListData()

        return v
    }

    private fun prepareChatListData(){
        var chat = Chat("Anne Anindhita, S.Pd", R.drawable.chat_1)
        chatList.add(chat)
        chat = Chat("Nita Aryani, S.Pd", R.drawable.chat_2)
        chatList.add(chat)
        chat = Chat("Titi Setiawati, S.Pd", R.drawable.chat_3)
        chatList.add(chat)
        chat = Chat("Dadi, S.Pd", R.drawable.chat_4)
        chatList.add(chat)
        chat = Chat("Elin Kusmayati, S.Pd", R.drawable.chat_5)
        chatList.add(chat)
        chat = Chat("Yeni Nuryeni, S.Pd", R.drawable.chat_6)
        chatList.add(chat)
        chat = Chat("Risma, S.Pd", R.drawable.chat_7)
        chatList.add(chat)
        chat = Chat("Anne Anindhita, S.Pd", R.drawable.chat_1)
        chatList.add(chat)
        chat = Chat("Nita Aryani, S.Pd", R.drawable.chat_2)
        chatList.add(chat)
        chat = Chat("Titi Setiawati, S.Pd", R.drawable.chat_3)
        chatList.add(chat)
        chat = Chat("Dadi, S.Pd", R.drawable.chat_3)
        chatList.add(chat)

        recyclerViewChatAdapter!!.notifyDataSetChanged()

    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment ChatFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            ChatFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}