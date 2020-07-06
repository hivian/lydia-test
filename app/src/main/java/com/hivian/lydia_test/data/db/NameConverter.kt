package com.hivian.lydia_test.data.db

import androidx.room.TypeConverter
import com.hivian.lydia_test.common.fromJson
import com.hivian.lydia_test.common.toJson
import com.hivian.lydia_test.data.model.Name

class NameConverter {

    @TypeConverter
    fun nameToJson(value: Name): String {
        return toJson(value)
    }

    @TypeConverter
    fun jsonToName(value: String): Name {
        return fromJson<Name>(value)
    }
}