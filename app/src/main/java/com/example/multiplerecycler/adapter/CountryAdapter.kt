package com.example.multiplerecycler.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.multiplerecycler.R
import com.example.multiplerecycler.model.Country
import kotlinx.android.synthetic.main.item_country.view.*

class CountryAdapter(var countryList:ArrayList<Country>): RecyclerView.Adapter<CountryAdapter.CountryViewHolder>() {
    class CountryViewHolder(itemview:View):RecyclerView.ViewHolder(itemview){
        fun bind(country:Country){
            itemView.tv_country.text = country.country_name
            itemView.iv_country.setImageResource(country.country_image)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountryViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.item_country,parent,false)
        return CountryViewHolder(view)
    }

    override fun onBindViewHolder(holder: CountryViewHolder, position: Int) {
        holder.bind(countryList[position])
    }

    override fun getItemCount(): Int = countryList.size
}