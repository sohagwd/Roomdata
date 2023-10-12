package com.example.roomdb

import androidx.room.*

@Dao
interface UserDao {
    @Query("SELECT * FROM user_table")
    fun getAll(): List<User>

   /* @Query("SELECT * FROM student_table WHERE uid IN (:userIds)")
    fun loadAllByIds(userIds: IntArray): List<Student>*/

    @Query("SELECT * FROM user_table WHERE email LIKE :roll LIMIT 1")
    suspend fun findByRoll(roll: Int): User

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(student: User)

    @Delete
    suspend fun delete(student: User)

    @Query("DELETE FROM user_table")
    suspend fun deleteAll()
}