package com.project.innerpeace

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ImageAdapter(
    private val context: Context,
    private val images: List<Image>,
    val listener: (Image) -> Unit
) : RecyclerView.Adapter<ImageAdapter.ImageViewHolder>() {
    inner class ImageViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        init {
            view.setOnClickListener {
                context.startActivity(Intent(context, Detail_view::class.java))
            }
        }

        val imageSrc = view.findViewById<ImageView>(R.id.image)
        val imageTitle = view.findViewById<TextView>(R.id.title)
        val imageSummary = view.findViewById<TextView>(R.id.summary)
        fun bindView(image: Image, listener: (Image) -> Unit) {
            imageSrc.setImageResource(image.imageSrc)
            imageTitle.text = image.imageTitle
            imageSummary.text = image.imageSummary
            itemView.setOnClickListener {
                listener(image)
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder =
        ImageViewHolder(LayoutInflater.from(context).inflate(R.layout.item, parent, false))

    override fun getItemCount(): Int = images.size

    override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {
        holder.bindView(images[position], listener)
    }
}
