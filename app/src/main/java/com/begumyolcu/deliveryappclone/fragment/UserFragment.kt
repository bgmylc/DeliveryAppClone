package com.begumyolcu.deliveryappclone.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.begumyolcu.deliveryappclone.ProfileItem
import com.begumyolcu.deliveryappclone.R
import com.begumyolcu.deliveryappclone.User
import com.begumyolcu.deliveryappclone.adapter.CategoriesAdapter
import com.begumyolcu.deliveryappclone.adapter.ProfileItemAdapter
import com.begumyolcu.deliveryappclone.adapter.UserAdapter
import com.begumyolcu.deliveryappclone.databinding.FragmentUserBinding

class UserFragment : Fragment() {
    private lateinit var design:FragmentUserBinding
    private lateinit var adapter: UserAdapter
    private lateinit var adapterTwo: ProfileItemAdapter
    private lateinit var user: User
    private lateinit var actionList: ArrayList<ProfileItem>


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        design = DataBindingUtil.inflate(inflater, R.layout.fragment_user, container, false)
        design.rvUserOne.layoutManager = LinearLayoutManager(requireContext())
        design.rvUserTwo.layoutManager = LinearLayoutManager(requireContext())

        design.userFragment = this
        design.userFragmentToolbarTitle = getString(R.string.profile)

        user = User(1, "Begüm Yolcu", "+90 (555) 555-5577", "segum@floki.com","logo_user")

        actionList = ArrayList()

        val i1 = ProfileItem(1, getString(R.string.adresses), "location_logo")
        val i2 = ProfileItem(2, getString(R.string.favourite_restaurants), "fav_logo")
        val i3 = ProfileItem(3, getString(R.string.payment_methods), "payment_logo")


        adapter = UserAdapter(requireContext(), user)
        adapterTwo = ProfileItemAdapter(requireContext(), actionList)

        design.rvUserOne.adapter = adapter
        design.rvUserTwo.adapter = adapterTwo

        return design.root
    }

}