package com.begumyolcu.deliveryappclone.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.navArgs
import com.begumyolcu.deliveryappclone.R
import com.begumyolcu.deliveryappclone.databinding.FragmentCategoryDetailBinding


class CategoryDetailFragment : Fragment() {

    private lateinit var design: FragmentCategoryDetailBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        design = DataBindingUtil.inflate(inflater,
            R.layout.fragment_category_detail, container, false)

        val bundle: CategoryDetailFragmentArgs by navArgs()
        val incomingCategory = bundle.category

        design.textViewDetail.text = "${incomingCategory.category_name} Category Details"

        design.categoryDetailFragment = this
        design.categoryDetailToolbarTitle = incomingCategory.category_name

        return design.root
    }

}