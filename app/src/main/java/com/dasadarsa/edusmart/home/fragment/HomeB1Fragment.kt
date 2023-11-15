package com.dasadarsa.edusmart.home.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.dasadarsa.edusmart.R
import com.dasadarsa.edusmart.home.adapter.RecyclerViewHomeB1Adapter

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [HomeB1Fragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class HomeB1Fragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null
    private var recyclerView : RecyclerView? = null
    private var recyclerViewHomeB1Adapter : RecyclerViewHomeB1Adapter? = null
    private var homeB1List = mutableListOf<HomeB1>()

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
        val v = inflater.inflate(R.layout.fragment_home_b1, container, false)

        homeB1List = ArrayList()

        recyclerView = v.findViewById<View>(R.id.rvAbsenList) as RecyclerView
        recyclerViewHomeB1Adapter = RecyclerViewHomeB1Adapter(this@HomeB1Fragment, homeB1List)
        val  layoutManager : RecyclerView.LayoutManager = LinearLayoutManager(context)
        recyclerView!!.layoutManager = layoutManager
        recyclerView!!.adapter = recyclerViewHomeB1Adapter

        prepareScoreListData()

        return v
    }

    private fun prepareScoreListData(){
        var homeB1 = HomeB1("Januari", R.drawable.home_9)
        homeB1List.add(homeB1)
        homeB1 = HomeB1("Februari", R.drawable.home_9)
        homeB1List.add(homeB1)
        homeB1 = HomeB1("Maret", R.drawable.home_9)
        homeB1List.add(homeB1)
        homeB1 = HomeB1("April", R.drawable.home_9)
        homeB1List.add(homeB1)
        homeB1 = HomeB1("Mei", R.drawable.home_9)
        homeB1List.add(homeB1)
        homeB1 = HomeB1("Juni", R.drawable.home_9)
        homeB1List.add(homeB1)
        homeB1 = HomeB1("Juli", R.drawable.home_9)
        homeB1List.add(homeB1)
        homeB1 = HomeB1("Agustus", R.drawable.home_9)
        homeB1List.add(homeB1)
        homeB1 = HomeB1("September", R.drawable.home_9)
        homeB1List.add(homeB1)
        homeB1 = HomeB1("Oktober", R.drawable.home_9)
        homeB1List.add(homeB1)
        homeB1 = HomeB1("November", R.drawable.home_9)
        homeB1List.add(homeB1)

        recyclerViewHomeB1Adapter!!.notifyDataSetChanged()

    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment HomeB1Fragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            HomeB1Fragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}