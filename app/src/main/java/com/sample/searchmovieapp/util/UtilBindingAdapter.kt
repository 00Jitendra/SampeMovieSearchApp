package com.sample.searchmovieapp.util

import android.graphics.Paint
import android.util.Log
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.databinding.BindingAdapter
import com.sample.searchmovieapp.util.imageHelper.ImageHelper

import java.util.*






@BindingAdapter("fonts")
fun setFonts(textView: TextView, resource: String) {

    textView.typeface = TypefaceUtil.setfonts(textView.context, resource)
}
@BindingAdapter("txt")
fun setText(textView: TextView, resource: String,resource2: String) {

    textView.text = resource + " " +"( "+resource2+ " )"
}

@BindingAdapter("capitalize")
fun capitalizeText(textView: TextView, resource: String) {

    textView.text = resource.capitalize()
}

@BindingAdapter("dpSrc")
fun setImageLinkRes(imageView: ImageView, resource: String) {

    if (resource.isNotEmpty())
        ImageHelper.loadImage(imageView, resource, imageView.context)
}

@BindingAdapter("app:srcCompat")
fun setImageLinkResource(imageView: ImageView, resource: String) {

    if (resource.isNotEmpty()){

        ImageHelper.loadImage(imageView, resource, imageView.context)
    }else{
        Log.e("UtilBindingAdapter", "res is empty $resource")
    }

}

@BindingAdapter("app:srcCompat", "imageWithBackground")
fun setImageWithBackground(imageView: ImageView, resource: Int, background: Int) {
    imageView.setImageResource(resource)
    imageView.background = ContextCompat.getDrawable(imageView.context, background)
}

