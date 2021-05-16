package com.begumyolcu.deliveryappclone

import java.io.Serializable

data class User(var user_id: Int, var user_name : String, var user_no : String, var user_email : String,var user_image_name : String) : Serializable {
}