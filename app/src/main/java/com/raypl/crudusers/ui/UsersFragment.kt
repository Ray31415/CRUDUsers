package com.raypl.crudusers.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.raypl.crudusers.databinding.FragmentUserListBinding
import org.koin.android.ext.android.get

class UsersFragment: Fragment() {

    var binding: FragmentUserListBinding? = null
    private var viewModel = get<UsersViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentUserListBinding.inflate(inflater, container, false)
        viewModel.retrieveUserList()
        return binding?.root

    }
}