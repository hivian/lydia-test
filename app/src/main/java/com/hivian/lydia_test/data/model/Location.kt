package com.hivian.lydia_test.data.model

import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName


data class Location(

    @PrimaryKey
    @SerializedName("street")
    val street: String,

    @PrimaryKey
    @SerializedName("city")
    val city: String,

    @PrimaryKey
    @SerializedName("state")
    val state: String,

    @PrimaryKey
    @SerializedName("postcode")
    val postcode: Int

)