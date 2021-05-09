package com.begumyolcu.deliveryappclone

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.begumyolcu.deliveryappclone.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {
    private lateinit var design:FragmentHomeBinding
    private lateinit var adapter:CategoriesAdapter
    private lateinit var categoriesList: ArrayList<Categories>


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        design = DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false)
        design.rvHome.layoutManager = StaggeredGridLayoutManager(4, StaggeredGridLayoutManager.VERTICAL)

        categoriesList = ArrayList()
        val c1 = Categories(1, "Beverages", "beverages")
        val c2 = Categories(2, "Fruits & Veg", "fruitsandveg")
        val c3 = Categories(3, "Baked Goods", "bakedgoods")
        val c4 = Categories(4, "Food", "food")
        val c5 = Categories(5, "Snacks", "snacks")
        val c6 = Categories(6, "Ice Cream", "icecream")
        val c7 = Categories(7, "Ready to Eat", "readytoeat")
        val c8 = Categories(8, "Dairy & Deli", "dairyanddeli")
        val c9 = Categories(9, "Fit & Form", "fitandform")
        val c10 = Categories(10, "Personal Care", "personalcare")
        val c11 = Categories(11, "Home Care", "homecare")
        val c12 = Categories(12, "Tech", "tech")
        val c13 = Categories(13, "Pet Food", "petfood")
        val c14 = Categories(14, "Baby Care", "babycare")
        val c15 = Categories(15, "Clothing", "clothing")

        categoriesList.add(c1)
        categoriesList.add(c2)
        categoriesList.add(c3)
        categoriesList.add(c4)
        categoriesList.add(c5)
        categoriesList.add(c6)
        categoriesList.add(c7)
        categoriesList.add(c8)
        categoriesList.add(c9)
        categoriesList.add(c10)
        categoriesList.add(c11)
        categoriesList.add(c12)
        categoriesList.add(c13)
        categoriesList.add(c14)
        categoriesList.add(c15)


        adapter = CategoriesAdapter(requireContext(), categoriesList)
        design.rvHome.adapter = adapter



        return design.root
    }

}