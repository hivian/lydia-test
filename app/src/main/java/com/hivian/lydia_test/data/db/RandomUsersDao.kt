package com.hivian.lydia_test.data.db

import androidx.lifecycle.LiveData
import androidx.room.*
import com.hivian.lydia_test.data.model.RandomUser

@Dao
interface RandomUsersDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(vararg quoteEntity: RandomUser)

    @Update
    suspend fun update(vararg quoteEntity: RandomUser)

    @Delete
    suspend fun delete(vararg quoteEntity: RandomUser)

    @Query("DELETE FROM random_user_entity")
    suspend fun deleteAll()

    @Query("SELECT * FROM random_user_entity")
    fun getAllRandomUsers() : LiveData<List<RandomUser>>

    @Query("SELECT * FROM random_user_entity WHERE id = :id")
    suspend fun getRandomUserById(id : Int) : RandomUser

}