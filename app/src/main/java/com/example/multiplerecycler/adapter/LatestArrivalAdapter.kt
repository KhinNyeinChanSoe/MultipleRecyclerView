package com.example.multiplerecycler.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.multiplerecycler.R
import com.example.multiplerecycler.model.LatestArrival
import kotlinx.android.synthetic.main.fragment_latest_arrival.view.*
import kotlinx.android.synthetic.main.item_latest.view.*

class LatestArrivalAdapter(var latestArr:ArrayList<LatestArrival>): RecyclerView.Adapter<LatestArrivalAdapter.LatestArrivalViewHolder>() {
    class LatestArrivalViewHolder(itemview: View) : RecyclerView.ViewHolder(itemview) {
        fun bind(latestArrival: LatestArrival) {
            itemView.tv_latestNumber.text = latestArrival.number_latest
            itemView.tv_latestprice.text = latestArrival.price_latest
            itemView.tv_latestBrandName.text = latestArrival.brand_latest
            itemView.iv_latestImage.setImageResource(latestArrival.image_latest)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LatestArrivalViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.item_latest,parent,false)
        return LatestArrivalViewHolder(view)
    }

    override fun onBindViewHolder(holder: LatestArrivalViewHolder, position: Int) {
        holder.bind(latestArr[position])
    }

    override fun getItemCount(): Int = latestArr.size
}