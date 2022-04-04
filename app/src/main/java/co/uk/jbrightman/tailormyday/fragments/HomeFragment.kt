package co.uk.jbrightman.tailormyday.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import co.uk.jbrightman.tailormyday.R
import co.uk.jbrightman.tailormyday.databinding.FragmentHomeBinding

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonJournal.setOnClickListener {
            findNavController().navigate(R.id.action_HomeFragment_to_JournalFragment)
        }
        binding.buttonGoals.setOnClickListener {
            findNavController().navigate(R.id.action_HomeFragment_to_GoalsFragment)
        }
        binding.buttonCalories.setOnClickListener {
            findNavController().navigate(R.id.action_HomeFragment_to_CaloriesFragment)
        }
        binding.buttonExercise.setOnClickListener {
            findNavController().navigate(R.id.action_HomeFragment_to_ExerciseFragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}