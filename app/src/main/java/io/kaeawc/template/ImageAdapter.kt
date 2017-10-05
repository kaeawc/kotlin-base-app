package io.kaeawc.template

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup

open class ImageAdapter(open val images: List<Image>) : RecyclerView.Adapter<ImageViewHolder>() {

    override fun getItemCount(): Int = images.size

    override fun onBindViewHolder(holder: ImageViewHolder?, position: Int) {
        if (position !in (0..images.size)) return
        holder?.onBind(images[position])
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.image_view_holder, parent, false)
        return ImageViewHolder(view)
    }
}
