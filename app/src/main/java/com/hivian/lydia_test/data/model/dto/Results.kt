package com.hivian.lydia_test.data.model.dto

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

data class Results(

    @SerializedName("results")
    val results: List<RandomUserDTO>
)

@Entity(tableName = "random_user_entity")
data class RandomUserDTO(

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    var localId: Int,

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
    val cell: String,

    @ColumnInfo(name = "picture")
    @SerializedName("picture")
    val picture: Picture

)