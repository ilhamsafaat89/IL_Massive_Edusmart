package com.dasadarsa.edusmart.home.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.dasadarsa.edusmart.R
import com.dasadarsa.edusmart.home.adapter.RecyclerViewHomeC1Adapter
import com.dasadarsa.edusmart.home.data.HomeC1

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [HomeC1Fragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class HomeC1Fragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null
    private var recyclerView : RecyclerView? = null
    private var recyclerViewHomeC1Adapter : RecyclerViewHomeC1Adapter? = null
    private var homeC1List = mutableListOf<HomeC1>()


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
        var v = inflater.inflate(R.layout.fragment_home_c1, container, false)
        val x = inflater.inflate(R.layout.layout_home_c1_list_item, container, false)

        homeC1List = ArrayList()

        recyclerView = v.findViewById<View>(R.id.rvScoreList) as RecyclerView
        recyclerViewHomeC1Adapter = RecyclerViewHomeC1Adapter(this@HomeC1Fragment, homeC1List)
        val  layoutManager : RecyclerView.LayoutManager = GridLayoutManager(context, 2)
        recyclerView!!.layoutManager = layoutManager
        recyclerView!!.adapter = recyclerViewHomeC1Adapter

        prepareScoreListData()


//         fail to setup onclick fragment recyclerview
//        val bt = x.findViewById<ImageView>(R.id.ivScoreImg)
//        bt.setOnClickListener{
//            val home2Fragment = Home2Fragment()
//            val transaction : FragmentTransaction = requireFragmentManager().beginTransaction()
//            transaction.replace(R.id.fragment_container,home2Fragment)
//            transaction.addToBackStack(null)
//            transaction.commit()
//
//        }

        return v

    }

    private fun prepareScoreListData(){
        var homeC1 = HomeC1("B.Indonesia", R.drawable.home_1)
        homeC1List.add(homeC1)
        homeC1 = HomeC1("Biologi", R.drawable.home_1)
        homeC1List.add(homeC1)
        homeC1 = HomeC1("Matematika", R.drawable.home_1)
        homeC1List.add(homeC1)
        homeC1 = HomeC1("Fisika", R.drawable.home_1)
        homeC1List.add(homeC1)
        homeC1 = HomeC1("Kimia", R.drawable.home_1)
        homeC1List.add(homeC1)
        homeC1 = HomeC1("B.Inggris", R.drawable.home_1)
        homeC1List.add(homeC1)
        homeC1 = HomeC1("B.Prancis", R.drawable.home_1)
        homeC1List.add(homeC1)
        homeC1 = HomeC1("Sejarah", R.drawable.home_1)
        homeC1List.add(homeC1)
        homeC1 = HomeC1("Sosiologi", R.drawable.home_1)
        homeC1List.add(homeC1)
        homeC1 = HomeC1("Kesenian", R.drawable.home_1)
        homeC1List.add(homeC1)
        homeC1 = HomeC1("Jasmani", R.drawable.home_1)
        homeC1List.add(homeC1)

        recyclerViewHomeC1Adapter!!.notifyDataSetChanged()

    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment Home1Fragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            HomeC1Fragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}