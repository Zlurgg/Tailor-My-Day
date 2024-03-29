package co.uk.jbrightman.tailormyday.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import co.uk.jbrightman.tailormyday.R
import co.uk.jbrightman.tailormyday.databinding.FragmentCaloriesBinding

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class CaloriesFragment : Fragment() {

    private var _binding: FragmentCaloriesBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentCaloriesBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonCalories.setOnClickListener {
            findNavController().navigate(R.id.action_CaloriesFragment_to_HomeFragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}