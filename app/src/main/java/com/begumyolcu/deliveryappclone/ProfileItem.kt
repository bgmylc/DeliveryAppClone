package com.begumyolcu.deliveryappclone

import java.io.Serializable

data class ProfileItem(var item_id: Int, var item_name : String, var user_logo : String) : Serializable {
}