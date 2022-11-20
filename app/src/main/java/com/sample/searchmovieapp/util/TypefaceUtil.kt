package com.sample.searchmovieapp.util

import android.content.Context
import android.graphics.Typeface


object TypefaceUtil {

    fun getLightFont(context: Context): Typeface {
        val font_name = "GothamRounded-Medium.otf"
        return Typeface.createFromAsset(context.assets, "fonts/$font_name")
    }


    fun getGothamRoundedMedium(context: Context): Typeface {
        val font_name = "GothamRounded-Medium.otf"
        return Typeface.createFromAsset(context.assets, "fonts/$font_name")
    }

    fun getGothamMedium(context: Context): Typeface {
        val font_name = "GOTHAM-MEDIUM.TTF"
        return Typeface.createFromAsset(context.assets, "fonts/$font_name")
    }

    fun getGothamRoundedBook(context: Context): Typeface {
        val font_name = "GothamRounded-Book.otf"
        return Typeface.createFromAsset(context.assets, "fonts/$font_name")
    }

    fun getGothamUltra(context: Context): Typeface {
        val font_name = "GOTHAM-ULTRA.TTF"
        return Typeface.createFromAsset(context.assets, "fonts/$font_name")
    }

    fun setfonts(context: Context, fontName: String): Typeface {

        return when (fontName) {
            "GothamRoundedMedium" -> {
                val font_name = "GothamRounded-Medium.otf"
                Typeface.createFromAsset(context.assets, "fonts/$font_name")
            }
            "GothamMedium" -> {
                val font_name = "GOTHAM-MEDIUM.TTF"
                Typeface.createFromAsset(context.assets, "fonts/$font_name")
            }
            "GothamRoundedBook" -> {
                val font_name = "GothamRounded-Book.otf"
                Typeface.createFromAsset(context.assets, "fonts/$font_name")
            }
            "GothamUltra" -> {
                val font_name = "GOTHAM-ULTRA.TTF"
                Typeface.createFromAsset(context.assets, "fonts/$font_name")
            }
            else -> {
                val font_name = "GOTHAM-ULTRA.TTF"
                return Typeface.createFromAsset(context.assets, "fonts/$font_name")
            }
        }
    }

}