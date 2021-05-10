package com.begumyolcu.deliveryappclone

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.begumyolcu.deliveryappclone.databinding.FragmentUserBinding

class UserFragment : Fragment() {
    private lateinit var design:FragmentUserBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        design = DataBindingUtil.inflate(inflater, R.layout.fragment_user, container, false)
        design.rvUserOne.layoutManager = LinearLayoutManager(requireContext())

        //TODO burayı da tamamla
        return design.root
    }

}