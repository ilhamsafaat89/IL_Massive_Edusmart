package com.dasadarsa.edusmart.ortu.absensi.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.dasadarsa.edusmart.R
import com.dasadarsa.edusmart.ortu.absensi.AbsensiWaliFragment
import com.dasadarsa.edusmart.ortu.absensi.data.AbsensiWaliData

class RecycleViewHomeWaliAbsensiAdapter(
    private val activity: AbsensiWaliFragment,
    private val absensiWaliList: List<AbsensiWaliData>
) :
RecyclerView.Adapter<RecycleViewHomeWaliAbsensiAdapter.MyViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val inflater = LayoutInflater.from(parent.context).inflate(R.layout.layout_home_b1_list_item, parent, false)
        return MyViewHolder(inflater)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.tvAbsenTitle.text = absensiWaliList[position].title
        holder.ivAbsenImg.setImageResource(absensiWaliList[position].image)
    }

    class MyViewHolder(itemView: View)  : RecyclerView.ViewHolder(itemView){
        val tvAbsenTitle : TextView = itemView.findViewById(R.id.tv_AbsenTitle)
        val ivAbsenImg : ImageView = itemView.findViewById(R.id.ivAbsenImg)
        val cardView : CardView = itemView.findViewById(R.id.cardView)
    }

    override fun getItemCount(): Int {
        return absensiWaliList.size
    }
}