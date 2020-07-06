package com.hivian.lydia_test.data.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

data class Results(

    @SerializedName("results")
    val quotes: List<RandomUser>
)

@Entity(tableName = "random_user_entity")
data class RandomUser(

    @PrimaryKey
    @ColumnInfo(name = "id")
    val id: Int,

    @ColumnInfo(name = "gender")
    @SerializedName("gender")
    val gender: String,

    @ColumnInfo(name = "name")
    @SerializedName("name")
    val name: Name,

    @ColumnInfo(name = "location")
    @SerializedName("location")
    val location: Location,

    @ColumnInfo(name = "email")
    @SerializedName("email")
    val email: String,

    @ColumnInfo(name = "phone")
    @SerializedName("phone")
    val phone: String,

    @ColumnInfo(name = "cell")
    @SerializedName("cell")
    val cell: Int,

    @ColumnInfo(name = "picture")
    @SerializedName("picture")
    val picture: Picture

)