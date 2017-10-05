package io.kaeawc.template

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.ImageView

class ImageViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView) {

    val imageView = itemView?.findViewById<ImageView>(R.id.image_view)

    init {
        val context = itemView?.context
        if (context != null && imageView != null) {
            GlideApp.with(context).clear(imageView)
        }
    }

    fun onBind(image: Image) {

    }
}
