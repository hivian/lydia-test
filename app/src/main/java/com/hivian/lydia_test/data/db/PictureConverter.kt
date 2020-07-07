package com.hivian.lydia_test.data.db

import androidx.room.TypeConverter
import com.hivian.lydia_test.common.fromJson
import com.hivian.lydia_test.common.toJson
import com.hivian.lydia_test.data.model.dto.Picture

class PictureConverter {

    @TypeConverter
    fun pictureToJson(value: Picture): String {
        return toJson(value)
    }

    @TypeConverter
    fun jsonToPicture(value: String): Picture {
        return fromJson<Picture>(value)
    }
}