package com.example.multiplerecycler

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.multiplerecycler.adapter.CountryAdapter
import com.example.multiplerecycler.model.Country
import kotlinx.android.synthetic.main.fragment_country.*



class CountryFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_country, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var country_arr = ArrayList<Country>()
        country_arr.add(Country("Japan",R.drawable.japan))
        country_arr.add(Country("Japan",R.drawable.japan))
        country_arr.add(Country("Japan",R.drawable.japan))
        country_arr.add(Country("Japan",R.drawable.japan))
        var country_adapter = CountryAdapter(country_arr)
        recycler_popularcountry.layoutManager = GridLayoutManager(context,2)
        recycler_popularcountry.adapter = country_adapter
    }
}