package com.begumyolcu.deliveryappclone.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.begumyolcu.deliveryappclone.R
import com.begumyolcu.deliveryappclone.databinding.FragmentSearchBinding

class SearchFragment : Fragment() {

    private lateinit var design: FragmentSearchBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        design = DataBindingUtil.inflate(inflater, R.layout.fragment_search, container, false)
        design.searchFragment = this
        design.searchFragmentToolbarTitle = getString(R.string.search)

        return design.root
    }

}