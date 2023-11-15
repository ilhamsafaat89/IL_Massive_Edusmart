package com.dasadarsa.edusmart.home.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.dasadarsa.edusmart.R
import com.dasadarsa.edusmart.home.data.HomeB1
import com.dasadarsa.edusmart.home.fragment.HomeB1Fragment

class RecyclerViewHomeB1Adapter constructor(private val getActivity: HomeB1Fragment, private val homeB1List: List<HomeB1>) :
    RecyclerView.Adapter<RecyclerViewHomeB1Adapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.layout_home_b1_list_item, parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return homeB1List.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.tvAbsenTitle.text = homeB1List[position].title
        holder.ivAbsenImg.setImageResource(homeB1List[position].image)

//        holder.cardView.setOnClickListener {
//            val fragmentTransaction = getActivity.parentFragmentManager.beginTransaction()
//            val targetFragment = HomeC2Fragment()
//            fragmentTransaction.replace(R.id.fragment_container, targetFragment)
//            fragmentTransaction.addToBackStack(null)
//            fragmentTransaction.commit()
//
//        }


//        holder.cardView.setOnClickListener {
//            Toast.makeText(getActivity, scoreList[position].title, Toast.LENGTH_LONG).show()
//        }
    }

    class MyViewHolder(itemView : View)  : RecyclerView.ViewHolder(itemView){
        val tvAbsenTitle : TextView = itemView.findViewById(R.id.tv_AbsenTitle)
        val ivAbsenImg : ImageView = itemView.findViewById(R.id.ivAbsenImg)
        val cardView : CardView = itemView.findViewById(R.id.cardView)
    }
}