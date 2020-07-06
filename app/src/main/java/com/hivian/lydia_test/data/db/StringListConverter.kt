package com.hivian.lydia_test.data.db

import androidx.room.TypeConverter
import com.hivian.lydia_test.common.fromJson
import com.hivian.lydia_test.common.toJson

class StringListConverter {

    @TypeConverter
    fun listToJson(value: List<String>): String {
        return toJson(value)
    }

    @TypeConverter
    fun jsonToList(value: String): List<String> {
        return fromJson<List<String>>(value)
    }
}