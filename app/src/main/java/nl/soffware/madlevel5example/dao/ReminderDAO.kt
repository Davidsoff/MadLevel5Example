package nl.soffware.madlevel5example.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import nl.soffware.madLevel5Example.data_classes.Reminder

@Dao
interface ReminderDAO {

    @Query("SELECT * FROM reminderTable")
    fun getAllReminders(): LiveData<List<Reminder>>

    @Insert
    suspend fun insertReminder(reminder: Reminder)

    @Delete
    suspend fun deleteReminder(reminder: Reminder)

    @Update
    suspend fun updateReminder(reminder: Reminder)

}