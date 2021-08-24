package com.phongbm.dmh.featureone

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.phongbm.dmh.featureone.databinding.FragmentFeatureOneBinding
import com.phongbm.dynamicmodulehilt.FeatureOneModuleDependencies
import dagger.hilt.android.EntryPointAccessors
import javax.inject.Inject

/**
 * Created by PhongBM on 08/23/2021
 */

class FeatureOneFragment : Fragment() {
    private var _binding: FragmentFeatureOneBinding? = null
    private val binding
        get() = _binding!!

    @Inject
    lateinit var viewModel: FeatureOneViewModel

    override fun onAttach(context: Context) {
        super.onAttach(context)

        val featureOneModuleDependencies = EntryPointAccessors
                .fromApplication(requireContext(), FeatureOneModuleDependencies::class.java)

        DaggerFeatureOneComponent
                .factory()
                .create(featureOneModuleDependencies)
                .inject(this)
    }

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