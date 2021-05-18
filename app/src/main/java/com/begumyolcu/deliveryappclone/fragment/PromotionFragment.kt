package com.begumyolcu.deliveryappclone.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.begumyolcu.deliveryappclone.ProfileItem
import com.begumyolcu.deliveryappclone.Promotion
import com.begumyolcu.deliveryappclone.R
import com.begumyolcu.deliveryappclone.User
import com.begumyolcu.deliveryappclone.adapter.ProfileItemAdapter
import com.begumyolcu.deliveryappclone.adapter.PromotionAdapter
import com.begumyolcu.deliveryappclone.databinding.FragmentPromotionBinding


class PromotionFragment : Fragment() {

    private lateinit var design : FragmentPromotionBinding
    private lateinit var adapterPro: PromotionAdapter
    private lateinit var promotionList: ArrayList<Promotion>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        design = DataBindingUtil.inflate(inflater, R.layout.fragment_promotion, container, false)
        design.rvPromotion.layoutManager = LinearLayoutManager(requireContext())

        design.promotionFragment = this
        design.promotionFragmentToolbarTitle = getString(R.string.promotion)

        promotionList = ArrayList()
        val p1 = Promotion(1,"Promotion 1","Discount miscount","sale")
        val p2 = Promotion(2,"Promotion 2","Discount miscount 50%","sale")
        promotionList.add(p1)
        promotionList.add(p2)

        adapterPro = PromotionAdapter(requireContext(), promotionList)
        design.adapterPromotion = adapterPro

        return design.root
    }

}