package com.dasadarsa.edusmart.ortu.absensi

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import android.widget.AdapterView
import android.widget.AdapterView.OnItemSelectedListener
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.cardview.widget.CardView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.fragment.app.FragmentTransaction
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



//        val arrayAdapter: ArrayAdapter<CharSequence> = ArrayAdapter.createFromResource(requireContext()
//            ,R.array.items,android.R.layout.simple_spinner_dropdown_item)




    }

    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_absensi_wali, container, false)

        val btnJanuari: CardView = view.findViewById(R.id.absenWaliJanuari)

        btnJanuari.setOnClickListener(View.OnClickListener {
            val fl: ConstraintLayout = view.findViewById(R.id.AbsensiWaliFragment)
            fl.removeAllViews()

            val toAbsensiWaliFragment2: Fragment= AbsensiWaliFragment2()
            val fragmentChange: FragmentTransaction? = getActivity()?.getSupportFragmentManager()?.beginTransaction()
            fragmentChange?.replace(R.id.AbsensiWaliFragment, toAbsensiWaliFragment2)?.commit()
        })

        return view
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