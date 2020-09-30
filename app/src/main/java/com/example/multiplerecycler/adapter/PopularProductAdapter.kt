package com.example.multiplerecycler.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.multiplerecycler.R
import com.example.multiplerecycler.model.PopularProduct
import kotlinx.android.synthetic.main.item_popular_product.view.*

class PopularProductAdapter(var produtList:ArrayList<PopularProduct>):RecyclerView.Adapter<PopularProductAdapter.PopularProductViewHolder>() {

    class PopularProductViewHolder(itemview:View):RecyclerView.ViewHolder(itemview){
        fun bind(popularProduct:PopularProduct){
            itemView.tv_discountPercent.text = popularProduct.discountPercent
            itemView.tv_p_p_Name.text = popularProduct.product_name
            itemView.tv_product_brandName.text = popularProduct.brand_name
            itemView.tv_p_product_price.text = popularProduct.product_price
            itemView.tv_p_cancelPrice.text = popularProduct.cancel_price
            itemView.iv_product.setImageResource(popularProduct.product_image)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PopularProductViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.item_popular_product,parent,false)
        return  PopularProductViewHolder(view)
    }

    override fun onBindViewHolder(holder: PopularProductViewHolder, position: Int) {
        holder.bind(produtList[position])
    }

    override fun getItemCount(): Int = produtList.size
}