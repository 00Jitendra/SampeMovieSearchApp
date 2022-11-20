package com.sample.searchmovieapp.util.imageHelper

import android.content.Context
import android.graphics.Bitmap
import android.graphics.drawable.Drawable
import android.util.TypedValue
import android.view.View
import android.widget.ImageView
import android.widget.ProgressBar
import androidx.annotation.NonNull
import androidx.core.graphics.drawable.RoundedBitmapDrawableFactory
import com.bumptech.glide.load.DataSource
import com.bumptech.glide.load.engine.GlideException
import com.bumptech.glide.request.RequestListener
import com.bumptech.glide.request.target.SimpleTarget
import com.bumptech.glide.request.target.Target
import com.bumptech.glide.request.transition.Transition
 import com.orhanobut.logger.Logger


class ImageHelper {


    companion object {

        fun loadImage(imageView: ImageView, @NonNull imageUrl: String, context: Context) {

            try {
                GlideApp.with(context)
                    .load(imageUrl)
                    .listener(object : RequestListener<Drawable> {
                        override fun onResourceReady(
                            resource: Drawable?,
                            model: Any?,
                            target: Target<Drawable>?,
                            dataSource: DataSource?,
                            isFirstResource: Boolean
                        ): Boolean {

                            return false
                        }

                        override fun onLoadFailed(
                            e: GlideException?,
                            model: Any?,
                            target: com.bumptech.glide.request.target.Target<Drawable>?,
                            isFirstResource: Boolean
                        ): Boolean {
                            Logger.d(e?.printStackTrace())
                            return false
                        }
                    })
                    .into(imageView)
            } catch (e: Exception) {
                e.printStackTrace()
            }

        }

        fun loadImageWithProgress(
            imageView: ImageView, @NonNull imageUrl: String,
            context: Context,
            progressBar: ProgressBar
        ) {


            GlideApp.with(context)
                .load(imageUrl).listener(object : RequestListener<Drawable> {
                    override fun onResourceReady(
                        resource: Drawable?,
                        model: Any?,
                        target: Target<Drawable>?,
                        dataSource: DataSource?,
                        isFirstResource: Boolean
                    ): Boolean {
                        progressBar.visibility = View.GONE

                        return false
                    }

                    override fun onLoadFailed(
                        e: GlideException?,
                        model: Any?,
                        target: com.bumptech.glide.request.target.Target<Drawable>?,
                        isFirstResource: Boolean
                    ): Boolean {
                        Logger.d(e?.printStackTrace())
                        return false
                    }
                })
                .into(imageView)

        }

        fun loadRound(imageView: ImageView, @NonNull imageUrl: String, context: Context) {
            try {
                GlideApp.with(context)
                    .asBitmap()
                    .load(imageUrl)
                    .into(object : SimpleTarget<Bitmap>() {
                        override fun onResourceReady(
                            resource: Bitmap,
                            transition: Transition<in Bitmap>?
                        ) {
                            val circularBitmapDrawable =
                                RoundedBitmapDrawableFactory.create(context.resources, resource)
                            circularBitmapDrawable.isCircular = true
                            imageView.setImageDrawable(circularBitmapDrawable)
                        }
                    })
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }

        fun dpToPx(c: Context, dp: Int): Int {
            val r = c.resources
            return Math.round(
                TypedValue.applyDimension(
                    TypedValue.COMPLEX_UNIT_DIP,
                    dp.toFloat(),
                    r.displayMetrics
                )
            )
        }


    }
}