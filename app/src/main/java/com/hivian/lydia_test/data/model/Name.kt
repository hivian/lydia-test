package com.hivian.lydia_test.data.model

import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName


data class Name(

    @PrimaryKey
    @SerializedName("title")
    val title: String,

    @PrimaryKey
    @SerializedName("first")
    val first: String,

    @PrimaryKey
    @SerializedName("last")
    val last: String

)