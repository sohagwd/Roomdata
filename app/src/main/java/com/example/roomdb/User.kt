package com.example.roomdb

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "user_table")
data class User(
    @PrimaryKey(autoGenerate = true) val id: Int?,
    @ColumnInfo(name = "name") val Name: String?,
    @ColumnInfo(name = "email") val Email: String?,
    @ColumnInfo(name = "number") val PhoneNo: Int?
)
