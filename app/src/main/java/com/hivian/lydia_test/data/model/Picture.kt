package com.hivian.lydia_test.data.model

import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName


data class Picture(

    @PrimaryKey
    @SerializedName("large")
    val large: String,

    @PrimaryKey
    @SerializedName("medium")
    val medium: String,

    @PrimaryKey
    @SerializedName("thumbnail")
    val thumbnail: String

)