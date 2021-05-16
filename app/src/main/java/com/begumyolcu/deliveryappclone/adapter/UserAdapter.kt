package com.begumyolcu.deliveryappclone.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.begumyolcu.deliveryappclone.User
import com.begumyolcu.deliveryappclone.databinding.HomeCardDesignBinding
import com.begumyolcu.deliveryappclone.databinding.UserFirstCardBinding
import com.begumyolcu.deliveryappclone.databinding.UserSecondCardBinding

class UserAdapter(var mContext : Context, var user : User) : RecyclerView.Adapter<UserAdapter.CardDesignHolder>() {

    inner class CardDesignHolder(firstCardBinding: UserFirstCardBinding) : RecyclerView.ViewHolder(firstCardBinding.root){
        var design: UserFirstCardBinding
        init{
            this.design = firstCardBinding
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardDesignHolder {
        val layoutInflater = LayoutInflater.from(mContext)
        val design = UserFirstCardBinding.inflate(layoutInflater, parent,false)
        return CardDesignHolder(design)
    }

    override fun onBindViewHolder(holder: CardDesignHolder, position: Int) {
        holder.design.textViewUserName.text = user.user_name
        holder.design.textViewUserNo.text = user.user_no
        holder.design.textViewUserEmail.text = user.user_email
        holder.design.imageViewUserProfile.setImageResource(mContext.resources.getIdentifier(user.user_image_name, "drawable", mContext.packageName))
    }

    override fun getItemCount(): Int {
        return 1
    }

}