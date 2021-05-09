package com.begumyolcu.deliveryappclone

import java.io.Serializable

data class Categories(var categoryId:Int, var category_name:String, var category_image_name:String) : Serializable {
}