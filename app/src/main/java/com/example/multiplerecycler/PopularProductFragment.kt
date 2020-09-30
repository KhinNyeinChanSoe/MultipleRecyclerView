package com.example.multiplerecycler

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.multiplerecycler.adapter.PopularProductAdapter
import com.example.multiplerecycler.model.PopularProduct
import kotlinx.android.synthetic.main.fragment_popular_product.*


class PopularProductFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_popular_product, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var productList = ArrayList<PopularProduct>()
        productList.add(PopularProduct("30 % off","Iphone 8 Plus","Apple","980000Ks","1100000Ks",R.drawable.iphone_eight_plus))
        productList.add(PopularProduct("30 % off","Iphone 8 Plus","Apple","980000Ks","1100000Ks",R.drawable.iphone_eight_plus))
        productList.add(PopularProduct("30 % off","Iphone 8 Plus","Apple","980000Ks","1100000Ks",R.drawable.iphone_eight_plus))
        productList.add(PopularProduct("30 % off","Iphone 8 Plus","Apple","980000Ks","1100000Ks",R.drawable.iphone_eight_plus))
        var productAdapter = PopularProductAdapter(productList)
        recycler_popularproduct.layoutManager = LinearLayoutManager(context)
        recycler_popularproduct.adapter = productAdapter
    }

}