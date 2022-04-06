package co.uk.jbrightman.tailormyday.model

import android.os.Build
import androidx.annotation.RequiresApi
import java.time.LocalDateTime

class JournalEntry(var dateTime: LocalDateTime, var entry: String) {

    @RequiresApi(Build.VERSION_CODES.O)
    override fun toString(): String {
        return "$dateTime $entry"
    }
}