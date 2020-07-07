package com.hivian.lydia_test.data.db

import androidx.room.TypeConverter
import com.hivian.lydia_test.common.fromJson
import com.hivian.lydia_test.common.toJson
import com.hivian.lydia_test.data.model.dto.Location

class LocationConverter {

    @TypeConverter
    fun locationToJson(value: Location): String {
        return toJson(value)
    }

    @TypeConverter
    fun jsonToLocation(value: String): Location {
        return fromJson<Location>(value)
    }
}