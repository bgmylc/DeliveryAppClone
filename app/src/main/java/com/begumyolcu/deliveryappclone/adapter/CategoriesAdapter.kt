package com.begumyolcu.deliveryappclone.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.begumyolcu.deliveryappclone.Categories
import com.begumyolcu.deliveryappclone.databinding.HomeCardDesignBinding
import com.begumyolcu.deliveryappclone.fragment.HomeFragmentDirections

class CategoriesAdapter(var mContext:Context, var categoriesList:List<Categories>) : RecyclerView.Adapter<CategoriesAdapter.CardDesignHolder>() {

    inner class CardDesignHolder(homeCardDesignBinding: HomeCardDesignBinding) : RecyclerView.ViewHolder(homeCardDesignBinding.root){
        var design: HomeCardDesignBinding

        init{
            this.design = homeCardDesignBinding
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardDesignHolder {
        val layoutInflater = LayoutInflater.from(mContext)
        val design = HomeCardDesignBinding.inflate(layoutInflater, parent,false)
        return CardDesignHolder(design)
    }

    override fun onBindViewHolder(holder: CardDesignHolder, position: Int) {
        val category = categoriesList.get(position)

        holder.design.imageViewCategory.setImageResource(mContext.resources.getIdentifier(category.category_image_name, "drawable", mContext.packageName))
        holder.design.textViewCategory.text = category.category_name


        holder.design.homeCardView.setOnClickListener {
            val pass = HomeFragmentDirections.homeCatAction(category)
            Navigation.findNavController(it).navigate(pass)
        }
    }

    override fun getItemCount(): Int {
        return categoriesList.size
    }


}