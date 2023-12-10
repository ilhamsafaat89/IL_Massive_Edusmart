package com.dasadarsa.edusmart.ortu.absensi

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.dasadarsa.edusmart.R

/**
 * A simple [Fragment] subclass.
 * Use the [AbsensiWaliFragment2.newInstance] factory method to
 * create an instance of this fragment.
 */
class AbsensiWaliFragment2 : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(com.dasadarsa.edusmart.ortu.ARG_PARAM1)
            param2 = it.getString(com.dasadarsa.edusmart.ortu.ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_absensi_wali2, container, false)
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment AbsensiWaliFragment2.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            AbsensiWaliFragment2().apply {
                arguments = Bundle().apply {
                    putString(com.dasadarsa.edusmart.ortu.ARG_PARAM1, param1)
                    putString(com.dasadarsa.edusmart.ortu.ARG_PARAM2, param2)
                }
            }
    }
}