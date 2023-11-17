package com.dasadarsa.edusmart.home.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.dasadarsa.edusmart.R
import com.dasadarsa.edusmart.home.adapter.RecyclerViewHomeC2Adapter
import com.dasadarsa.edusmart.home.data.HomeC2

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [HomeC2Fragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class HomeC2Fragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null
    private var recyclerView : RecyclerView? = null
    private var recyclerViewHomeC2Adapter : RecyclerViewHomeC2Adapter? = null
    private var subscoreList = mutableListOf<HomeC2>()

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

        val v = inflater.inflate(R.layout.fragment_home_c2, container, false)

        subscoreList = ArrayList()

        recyclerView = v.findViewById<View>(R.id.rvSubScoreList) as RecyclerView
        recyclerViewHomeC2Adapter = RecyclerViewHomeC2Adapter(this@HomeC2Fragment, subscoreList)
        val  layoutManager : RecyclerView.LayoutManager = LinearLayoutManager(context)
        recyclerView!!.layoutManager = layoutManager
        recyclerView!!.adapter = recyclerViewHomeC2Adapter

        prepareScoreListData()

        return v
    }

    private fun prepareScoreListData(){
        var subscore = HomeC2("Tugas 1", R.drawable.home_1)
        subscoreList.add(subscore)
        subscore = HomeC2("Ulangan Harian 1", R.drawable.home_1)
        subscoreList.add(subscore)
        subscore = HomeC2("Tugas 2", R.drawable.home_1)
        subscoreList.add(subscore)
        subscore = HomeC2("UTS", R.drawable.home_1)
        subscoreList.add(subscore)
        subscore = HomeC2("UAS", R.drawable.home_1)
        subscoreList.add(subscore)
        subscore = HomeC2("Ujian Praktik", R.drawable.home_1)
        subscoreList.add(subscore)
        subscore = HomeC2("Kehadiran", R.drawable.home_1)
        subscoreList.add(subscore)
        subscore = HomeC2("Sikap", R.drawable.home_1)
        subscoreList.add(subscore)
        subscore = HomeC2("Tambahan", R.drawable.home_1)
        subscoreList.add(subscore)
        subscore = HomeC2("Konsistensi", R.drawable.home_1)
        subscoreList.add(subscore)
        subscore = HomeC2("Nilai Akhir", R.drawable.home_1)
        subscoreList.add(subscore)

        recyclerViewHomeC2Adapter!!.notifyDataSetChanged()

    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment Home2Fragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            HomeC2Fragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}