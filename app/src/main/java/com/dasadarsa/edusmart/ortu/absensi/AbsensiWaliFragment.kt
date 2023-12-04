package com.dasadarsa.edusmart.ortu.absensi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.dasadarsa.edusmart.R
import com.dasadarsa.edusmart.home.data.HomeB1
import com.dasadarsa.edusmart.ortu.absensi.adapter.RecycleViewHomeWaliAbsensiAdapter
import com.dasadarsa.edusmart.ortu.absensi.data.AbsensiWaliData

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [AbsensiWaliFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class AbsensiWaliFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null
    private var recyclerView : RecyclerView? = null
    private var recycleViewHomeWaliAbsensiAdapter : RecycleViewHomeWaliAbsensiAdapter? = null
    private var absensiWaliList = mutableListOf<AbsensiWaliData>()

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
        val view = inflater.inflate(R.layout.fragment_absensi_wali, container, false)

        absensiWaliList = ArrayList()

        recyclerView = view.findViewById(R.id.rvAbsenList) as RecyclerView
        recycleViewHomeWaliAbsensiAdapter = RecycleViewHomeWaliAbsensiAdapter(this, absensiWaliList)
        val  layoutManager : RecyclerView.LayoutManager = LinearLayoutManager(context)
        recyclerView!!.layoutManager = layoutManager
        recyclerView!!.adapter = recycleViewHomeWaliAbsensiAdapter

        prepareScoreListData()

        return view
    }

    private fun prepareScoreListData(){
        var absensiWaliData = AbsensiWaliData("Januari", R.drawable.home_9)
        absensiWaliList.add(absensiWaliData)
        absensiWaliData = AbsensiWaliData("Februari", R.drawable.home_9)
        absensiWaliList.add(absensiWaliData)
        absensiWaliData = AbsensiWaliData("Maret", R.drawable.home_9)
        absensiWaliList.add(absensiWaliData)
        absensiWaliData = AbsensiWaliData("April", R.drawable.home_9)
        absensiWaliList.add(absensiWaliData)
        absensiWaliData = AbsensiWaliData("Mei", R.drawable.home_9)
        absensiWaliList.add(absensiWaliData)
        absensiWaliData = AbsensiWaliData("Juni", R.drawable.home_9)
        absensiWaliList.add(absensiWaliData)
        absensiWaliData = AbsensiWaliData("Juli", R.drawable.home_9)
        absensiWaliList.add(absensiWaliData)
        absensiWaliData = AbsensiWaliData("Agustus", R.drawable.home_9)
        absensiWaliList.add(absensiWaliData)
        absensiWaliData = AbsensiWaliData("September", R.drawable.home_9)
        absensiWaliList.add(absensiWaliData)
        absensiWaliData = AbsensiWaliData("Oktober", R.drawable.home_9)
        absensiWaliList.add(absensiWaliData)
        absensiWaliData = AbsensiWaliData("November", R.drawable.home_9)
        absensiWaliList.add(absensiWaliData)
        absensiWaliData = AbsensiWaliData("Desember", R.drawable.home_9)
        absensiWaliList.add(absensiWaliData)



        recycleViewHomeWaliAbsensiAdapter!!.notifyDataSetChanged()

    }


    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment AbsensiWaliFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            AbsensiWaliFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}