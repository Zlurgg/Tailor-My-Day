package co.uk.jbrightman.tailormyday.fragments

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment
import co.uk.jbrightman.tailormyday.R

/**
 * Journal Fragment
 * Allows user to log mood / thoughts and retrieve previous entries (calendar of some kind)
 * Save entries to a interactive calender
 */
class JournalFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, parent: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view: View = inflater.inflate(R.layout.fragment_journal, parent, false)
        view.findViewById<Button>(R.id.done_button)?.setOnClickListener {
            updateJournalEntry()
            hideTheKeyboard()
        }
        return view
    }

    private fun updateJournalEntry() {
        val journalEditText = view?.findViewById<EditText>(R.id.journal_text_edit)
        val journalTextView = view?.findViewById<TextView>(R.id.journal_text)
        val doneButton = view?.findViewById<Button>(R.id.done_button)

        journalTextView?.text = journalEditText?.text

        journalEditText?.visibility = View.GONE
        doneButton?.visibility = View.GONE
        journalTextView?.visibility = View.VISIBLE
    }

    private fun hideTheKeyboard() {
        val imm = requireActivity().getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(requireView().windowToken, 0)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }

    override fun onDestroyView() {
        super.onDestroyView()
    }
}