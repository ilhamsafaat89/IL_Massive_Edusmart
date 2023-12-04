package com.dasadarsa.edusmart.ortu.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import com.dasadarsa.edusmart.R
import com.github.mikephil.charting.charts.BarChart
import com.github.mikephil.charting.components.XAxis
import com.github.mikephil.charting.data.BarData
import com.github.mikephil.charting.data.BarDataSet
import com.github.mikephil.charting.data.BarEntry
import com.github.mikephil.charting.formatter.IndexAxisValueFormatter

private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class HomeWaliFragment : Fragment() {
    private var param1: String? = null
    private var param2: String? = null

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
        val view = inflater.inflate(R.layout.fragment_home_wali, container, false)

        // Barchart Nilai
        setupNilaiBarChart(view)

        // Barchart Absensi
        setupAbsensiBarChart(view)

        return view
    }

    private fun setupNilaiBarChart(view: View) {
        val barChartNilai: BarChart = view.findViewById(R.id.barchartNilai)
        val namaMataPelajaran = listOf("Biologi", "Matematika", "B.Inggris", "Kimia", "Fisika", "B.Indonesia")
        val nilaiSiswa1 = listOf(90f, 85f, 88f, 90f, 100f, 50f)
        val barEntries = mutableListOf<BarEntry>()

        for (i in namaMataPelajaran.indices) {
            barEntries.add(BarEntry(i.toFloat() + 1, nilaiSiswa1[i]))
        }

        val barDataSet = BarDataSet(barEntries, "Nilai Mata Pelajaran")
        val barData = BarData(barDataSet)
        val warna = ContextCompat.getColor(requireContext(), R.color.blue_rebranding)

        barDataSet.apply {
            setValueTextColors(listOf(warna))
            setColors(listOf(warna))
        }

        barChartNilai.apply {
            data = barData
            setFitBars(true)
            description.isEnabled = false
            legend.isEnabled = false
            xAxis.textColor = warna
            axisLeft.textColor = warna
            axisRight.isEnabled = false
            setDrawValueAboveBar(true)

            // Konfigurasi sumbu X mata pelajaran
            val xAxis = xAxis
            xAxis.valueFormatter = IndexAxisValueFormatter(namaMataPelajaran)
            xAxis.position = XAxis.XAxisPosition.BOTTOM
            xAxis.setDrawGridLines(false)
            xAxis.setDrawAxisLine(true)
            xAxis.labelRotationAngle = -45f
            xAxis.setCenterAxisLabels(true)

            // Agar nama mata pelajaran dapat terbaca dengan baik
            axisLeft.axisMinimum = 0f

            // Animasi
            animateY(1000)
        }
    }

    private fun setupAbsensiBarChart(view: View) {
        val barChartAbsensi: BarChart = view.findViewById(R.id.barchartAbsensi)
        val persentaseAbsensi = listOf(90f, 85f, 88f, 92f, 78f, 95f, 89f, 93f, 80f, 87f, 91f, 84f)
        val barEntriesAbsensi = mutableListOf<BarEntry>()

        for (i in persentaseAbsensi.indices) {
            barEntriesAbsensi.add(BarEntry(i.toFloat() + 1, persentaseAbsensi[i]))
        }

        val barDataSetAbsensi = BarDataSet(barEntriesAbsensi, "Absensi (%)")
        val warna = ContextCompat.getColor(requireContext(), R.color.blue_rebranding)

        barDataSetAbsensi.apply {
            valueTextSize = 10f
            setDrawValues(false)
            valueTextColor = warna
            color = warna
        }

        val namaBulan = arrayOf("Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec")

        barChartAbsensi.apply {
            val xAxisAbsensi = xAxis
            xAxisAbsensi.valueFormatter = IndexAxisValueFormatter(namaBulan)
            xAxisAbsensi.position = XAxis.XAxisPosition.BOTTOM
            xAxisAbsensi.setDrawGridLines(false)
            xAxisAbsensi.labelCount = namaBulan.size
            xAxisAbsensi.labelRotationAngle = -45f
            xAxisAbsensi.textColor = warna
            xAxisAbsensi.labelCount = namaBulan.size
            xAxisAbsensi.granularity = 1f
            xAxisAbsensi.setCenterAxisLabels(true)

            val barDataAbsensi = BarData(barDataSetAbsensi)
            data = barDataAbsensi
            setFitBars(true)
            xAxis.textColor = warna
            axisRight.isEnabled = false
            axisLeft.textColor = warna
            description.isEnabled = false
            legend.isEnabled = false
            barData.barWidth = 0.8f
            animateY(1500)
        }
    }


    companion object {
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            HomeWaliFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}