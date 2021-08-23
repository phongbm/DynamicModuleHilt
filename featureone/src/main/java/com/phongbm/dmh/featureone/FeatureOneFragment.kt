package com.phongbm.dmh.featureone

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.phongbm.dmh.featureone.databinding.FragmentFeatureOneBinding
import dagger.hilt.android.AndroidEntryPoint

/**
 * Created by PhongBM on 08/23/2021
 */

@AndroidEntryPoint
class FeatureOneFragment : Fragment() {
    private var _binding: FragmentFeatureOneBinding? = null
    private val binding
        get() = _binding!!

    private val viewModel: FeatureOneViewModel by viewModels()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        _binding = FragmentFeatureOneBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.btnDoSomething.setOnClickListener {
            viewModel.doSomething()
            Toast.makeText(requireContext(), "doSomething()", Toast.LENGTH_SHORT).show()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}