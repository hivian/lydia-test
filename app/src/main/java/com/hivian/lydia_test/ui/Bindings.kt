package com.hivian.lydia_test.ui

import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide


@BindingAdapter("imageUrl")
fun ImageView.setImageUrl(url: String) {
    Glide.with(context)
        .load(url)
        .into(this)
}

@BindingAdapter("firstNameText", "lastNameText")
fun TextView.setNameText(firstNameText: String, lastNameText: String) {
    text = "${firstNameText.capitalize()} ${lastNameText.capitalize()}"
}
