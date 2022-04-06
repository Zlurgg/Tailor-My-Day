package co.uk.jbrightman.tailormyday.model

import android.os.Build
import androidx.annotation.RequiresApi
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

class Journal {
    private val database = JournalDatabase()

    @RequiresApi(Build.VERSION_CODES.O)
    private fun readLocalDateTime(dateTimeFormatter: DateTimeFormatter): LocalDateTime {
        return try {
            LocalDateTime.parse(readLine(), dateTimeFormatter)
        } catch (e: Exception) {
            println("Incorrect date format. Please try again.")
            readLocalDateTime(dateTimeFormatter)
        }
    }

}