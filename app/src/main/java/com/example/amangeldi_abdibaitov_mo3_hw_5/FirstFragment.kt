package com.example.amangeldi_abdibaitov_mo3_hw_5

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.amangeldi_abdibaitov_mo3_hw_5.databinding.FragmentFirstBinding


class FirstFragment : Fragment() {

    private lateinit var binding: FragmentFirstBinding
    private var num = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFirstBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnOperation.setOnClickListener {
            num++
            binding.tvNumber.text = num.toString()

            if (binding.tvNumber.text.toString().equals("10")) {
                binding.btnOperation.text = "-1"

                binding.btnOperation.setOnClickListener {
                    num--
                    binding.tvNumber.text = num.toString()

                    if (binding.tvNumber.text.toString().equals("0")) {

                        val bundle = Bundle()
                        bundle.putString("2", binding.tvNumber.text.toString())

                        val secondFragment = SecondFragment()
                        secondFragment.arguments = bundle

                        requireActivity().supportFragmentManager.beginTransaction()
                            .replace(R.id.fl_first, SecondFragment()).commit()
                    }
                }
            }
        }
    }
}