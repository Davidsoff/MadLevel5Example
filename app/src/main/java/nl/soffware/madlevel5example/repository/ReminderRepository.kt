package nl.soffware.madLevel5Example.repositories

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import nl.soffware.madlevel5example.dao.ReminderDAO
import nl.soffware.madLevel5Example.data_classes.Reminder
import nl.soffware.madLevel5Example.databases.ReminderRoomDatabase

public class ReminderRepository(context: Context) {

    private var reminderDao: ReminderDAO?

    init {
        val reminderRoomDatabase = ReminderRoomDatabase.getDatabase(context)
        reminderDao = reminderRoomDatabase!!.reminderDao()
    }

    fun getAllReminders(): LiveData<List<Reminder>> {
        return reminderDao?.getAllReminders() ?: MutableLiveData(emptyList())
    }

    suspend fun insertReminder(reminder: Reminder) {
        reminderDao?.insertReminder(reminder)
    }

    suspend fun deleteReminder(reminder: Reminder) {
        reminderDao?.deleteReminder(reminder)
    }


    suspend fun updateReminder(reminder: Reminder) {
        reminderDao?.updateReminder(reminder)
    }
}
