package com.eazyalgo.objectdetectiontest

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.eazyalgo.objectdetectiontest.databinding.SimilarProductsBinding

class SimilarProductsAdapter(private val items:ArrayList<SimilarProduct> ,val context: Context): RecyclerView.Adapter<SimilarProductsAdapter.ViewHolder>(){
    class ViewHolder(val binding : SimilarProductsBinding):RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(SimilarProductsBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.tvSimilarProductName.text = items[position].name
        holder.binding.tvSimilarProductPrice.text = items[position].price

    }

    override fun getItemCount(): Int {
        return items.size
    }


}