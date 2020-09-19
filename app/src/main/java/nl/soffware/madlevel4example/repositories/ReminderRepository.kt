package nl.soffware.madlevel4example.repositories

import android.content.Context
import nl.soffware.madlevel4example.data_access.ReminderDAO
import nl.soffware.madlevel4example.data_classes.Reminder
import nl.soffware.madlevel4example.databases.ReminderRoomDatabase

public class ReminderRepository(context: Context) {

    private var reminderDao: ReminderDAO

    init {
        val reminderRoomDatabase = ReminderRoomDatabase.getDatabase(context)
        reminderDao = reminderRoomDatabase!!.reminderDao()
    }

    suspend fun getAllReminders(): List<Reminder> {
        return reminderDao.getAllReminders()
    }

    suspend fun insertReminder(reminder: Reminder) {
        reminderDao.insertReminder(reminder)
    }

    suspend fun deleteReminder(reminder: Reminder) {
        reminderDao.deleteReminder(reminder)
    }


    suspend fun updateReminder(reminder: Reminder) {
        reminderDao.updateReminder(reminder)
    }
}
