package nl.soffware.madlevel4example.data_access

import androidx.room.*
import nl.soffware.madlevel4example.data_classes.Reminder

@Dao
interface ReminderDAO {

    @Query("SELECT * FROM reminderTable")
    suspend fun getAllReminders(): List<Reminder>

    @Insert
    suspend fun insertReminder(reminder: Reminder)

    @Delete
    suspend fun deleteReminder(reminder: Reminder)

    @Update
    suspend fun updateReminder(reminder: Reminder)

}