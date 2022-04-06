package co.uk.jbrightman.tailormyday.fragments

import android.content.ContentValues.TAG
import android.os.Bundle
import android.text.Editable
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
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

    private var journalTextEdit: EditText? = null
    private var journalText: TextView? = null

    override fun onCreateView(
        inflater: LayoutInflater, parent: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view: View = inflater.inflate(R.layout.fragment_journal, parent, false)
        Log.d(TAG, "inflate view: $view")

        view.findViewById<Button>(R.id.done_button)?.setOnClickListener {
            createJournalEntry()
        }
        return view
    }

    private fun createJournalEntry() {
        journalTextEdit = view?.findViewById(R.id.journal_text_edit)
        journalText = view?.findViewById(R.id.journal_text)

        Log.d(TAG,"Journal Edit Text: ${journalTextEdit?.text.toString()}")
        Log.d(TAG,"Journal Text: ${journalText?.text.toString()}")

        journalTextEdit?.text = journalText?.text as Editable?
        journalText?.visibility = View.GONE
        view?.visibility = View.GONE

        journalTextEdit?.visibility = View.VISIBLE
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }

    override fun onDestroyView() {
        super.onDestroyView()
    }
}