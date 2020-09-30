
package com.example.multiplerecycler

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.HorizontalScrollView
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.multiplerecycler.adapter.LatestArrivalAdapter
import com.example.multiplerecycler.model.LatestArrival
import kotlinx.android.synthetic.main.fragment_latest_arrival.*

class LatestArrivalFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_latest_arrival, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//        var latestArrivalFragment = LatestArrivalFragment()
        var latestArr = ArrayList<LatestArrival>()
        latestArr.add(LatestArrival("Hyde Park N41015","LOUIS VUITTON","999,99999Ks",R.drawable.bag))
        latestArr.add(LatestArrival("Hyde Park N41015","LOUIS VUITTON","999,99999Ks",R.drawable.bag))
        latestArr.add(LatestArrival("Hyde Park N41015","LOUIS VUITTON","999,99999Ks",R.drawable.bag))
        var latestAdapter = LatestArrivalAdapter(latestArr)
        recycler_latest.layoutManager = LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false)
        recycler_latest.adapter = latestAdapter
    }

}