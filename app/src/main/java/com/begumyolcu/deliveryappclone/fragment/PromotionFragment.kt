package com.begumyolcu.deliveryappclone.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.begumyolcu.deliveryappclone.R
import com.begumyolcu.deliveryappclone.databinding.FragmentPromotionBinding


class PromotionFragment : Fragment() {

    private lateinit var design : FragmentPromotionBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        design = DataBindingUtil.inflate(inflater, R.layout.fragment_promotion, container, false)

        design.promotionFragment = this
        design.promotionFragmentToolbarTitle = getString(R.string.promotion)

        return design.root
    }

}