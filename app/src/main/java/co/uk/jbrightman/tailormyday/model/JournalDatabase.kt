package co.uk.jbrightman.tailormyday.model

import android.os.Build
import androidx.annotation.RequiresApi
import java.time.LocalDateTime

class JournalDatabase {
    private var entries: List<JournalEntry> = listOf()

    fun addEntry(dateTime: LocalDateTime, text: String) {
        entries += JournalEntry(dateTime, text)
    }

    @RequiresApi(Build.VERSION_CODES.O)
    fun findEntries(dateTime: LocalDateTime, byTime: Boolean): List<JournalEntry> {
        var found: List<JournalEntry> = listOf()

        for (z in entries) {
            if (((byTime) && (z.dateTime == dateTime)) // filtered by time and date
                ||
                (!byTime && z.dateTime.toLocalDate() == dateTime.toLocalDate()) // filtered by date only
            )
                found += z
        }
        return found
    }

    @RequiresApi(Build.VERSION_CODES.O)
    fun deleteEntries(dateTime: LocalDateTime) {
        val found = findEntries(dateTime, true)
        entries -= found
    }
}