package com.dasadarsa.edusmart.home.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.dasadarsa.edusmart.R
import com.dasadarsa.edusmart.home.data.HomeC1
import com.dasadarsa.edusmart.home.fragment.HomeC1Fragment
import com.dasadarsa.edusmart.home.fragment.HomeC2Fragment

class RecyclerViewHomeC1Adapter constructor(private val getActivity: HomeC1Fragment, private val homeC1List: List<HomeC1>) :
    RecyclerView.Adapter<RecyclerViewHomeC1Adapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.layout_home_c1_list_item, parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return homeC1List.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.tvScoreTitle.text = homeC1List[position].title
        holder.ivScoreImg.setImageResource(homeC1List[position].image)

        holder.cardView.setOnClickListener {
            val fragmentTransaction = getActivity.parentFragmentManager.beginTransaction()
            val targetFragment = HomeC2Fragment()
            fragmentTransaction.replace(R.id.fragment_container, targetFragment)
            fragmentTransaction.addToBackStack(null)
            fragmentTransaction.commit()

        }


//        holder.cardView.setOnClickListener {
//            Toast.makeText(getActivity, scoreList[position].title, Toast.LENGTH_LONG).show()
//        }
    }

    class MyViewHolder(itemView : View)  : RecyclerView.ViewHolder(itemView){
        val tvScoreTitle : TextView = itemView.findViewById(R.id.tv_ScoreTitle)
        val ivScoreImg : ImageView = itemView.findViewById(R.id.ivScoreImg)
        val cardView : CardView = itemView.findViewById(R.id.cardView)
    }
}