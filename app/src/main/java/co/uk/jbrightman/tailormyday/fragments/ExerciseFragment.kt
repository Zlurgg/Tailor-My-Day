package co.uk.jbrightman.tailormyday.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import co.uk.jbrightman.tailormyday.R
import co.uk.jbrightman.tailormyday.databinding.FragmentExerciseBinding

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class ExerciseFragment : Fragment() {

    private var _binding: FragmentExerciseBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentExerciseBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonExercise.setOnClickListener {
            findNavController().navigate(R.id.action_ExerciseFragment_to_HomeFragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}