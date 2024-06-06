package com.example.anmpstudent.view

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.BindingAdapter
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.example.anmpstudent.R
import com.example.anmpstudent.databinding.StudentListItemBinding
import com.example.anmpstudent.model.Student
import com.squareup.picasso.Picasso
@BindingAdapter("android:imageUrl")
fun loadPhotoURL(imageView: ImageView, url: String) {
    Log.d("Picasso", "Loading image from URL: $url")

    val picasso = Picasso.Builder(imageView.context)
    picasso.listener { picasso, uri, exception ->
        Log.e("Picasso", "Error loading image from $uri", exception)
    }
    picasso.build().load(url).into(imageView)
}