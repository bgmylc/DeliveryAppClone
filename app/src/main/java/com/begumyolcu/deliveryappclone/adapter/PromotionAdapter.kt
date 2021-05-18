package com.begumyolcu.deliveryappclone.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.begumyolcu.deliveryappclone.Promotion
import com.begumyolcu.deliveryappclone.databinding.PromotionCardBinding

class PromotionAdapter(var mContext : Context, var promotionList : ArrayList<Promotion>) : RecyclerView.Adapter<PromotionAdapter.CardDesignHolder>() {

    inner class CardDesignHolder(promotionCardBinding: PromotionCardBinding) : RecyclerView.ViewHolder(promotionCardBinding.root){
        var design: PromotionCardBinding

        init{
            this.design = promotionCardBinding
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardDesignHolder {
        val layoutInflater = LayoutInflater.from(mContext)
        val design = PromotionCardBinding.inflate(layoutInflater, parent, false)
        return CardDesignHolder(design)
    }

    override fun onBindViewHolder(holder: CardDesignHolder, position: Int) {
        val promotionItem = promotionList.get(position)

        holder.design.textViewPromotionTitle.text = promotionItem.promotion_title
        holder.design.textViewPromotionDescription.text = promotionItem.promotion_description
        holder.design.imageViewPromotion.setImageResource(mContext.resources.getIdentifier(promotionItem.promotion_image_name, "drawable", mContext.packageName))
    }

    override fun getItemCount(): Int {
        return promotionList.size
    }

}