package co.uk.jbrightman.tailormyday.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import co.uk.jbrightman.tailormyday.R
import co.uk.jbrightman.tailormyday.databinding.FragmentJournalBinding

/**
 * Journal Fragment
 * Allows user to log mood / thoughts and retrieve previous entries (calendar of some kind)
 * Save entries to a interactive calender
 */
class JournalFragment : Fragment() {

    private var _binding: FragmentJournalBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentJournalBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}