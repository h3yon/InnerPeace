package com.project.innerpeace

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class IntroPagerAdapter(private var pageList: ArrayList<PageItem>) : RecyclerView.Adapter<IntroPagerViewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): IntroPagerViewHolder {
        return IntroPagerViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.layout_intro_pager_item, parent, false))
    }

    override fun getItemCount(): Int {
        return pageList.size
    }

    override fun onBindViewHolder(holder: IntroPagerViewHolder, position: Int) {
        holder.bindWithView(pageList[position])
    }
}
