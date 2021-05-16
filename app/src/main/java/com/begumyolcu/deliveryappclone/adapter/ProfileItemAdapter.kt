package com.begumyolcu.deliveryappclone.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.begumyolcu.deliveryappclone.ProfileItem
import com.begumyolcu.deliveryappclone.User
import com.begumyolcu.deliveryappclone.databinding.UserFirstCardBinding
import com.begumyolcu.deliveryappclone.databinding.UserSecondCardBinding

class ProfileItemAdapter (var mContext : Context, var profileItemList : ArrayList<ProfileItem>) : RecyclerView.Adapter<ProfileItemAdapter.CardDesignHolder>() {

    inner class CardDesignHolder(secondCardBinding: UserSecondCardBinding) : RecyclerView.ViewHolder(secondCardBinding.root){
        var design: UserSecondCardBinding

        init{
            this.design = secondCardBinding
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardDesignHolder {
        val layoutInflater = LayoutInflater.from(mContext)
        val design = UserSecondCardBinding.inflate(layoutInflater, parent,false)
        return CardDesignHolder(design)
    }

    override fun onBindViewHolder(holder: CardDesignHolder, position: Int) {
        val profileItem = profileItemList.get(position)

        holder.design.textViewActionName.text = profileItem.item_name
        holder.design.imageViewActionLogo.setImageResource(mContext.resources.getIdentifier(profileItem.user_logo, "drawable", mContext.packageName))
    }

    override fun getItemCount(): Int {
        return profileItemList.size
    }

}