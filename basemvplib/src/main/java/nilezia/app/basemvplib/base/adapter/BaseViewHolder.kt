package nilezia.app.basemvplib.base.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

abstract class BaseViewHolder(parent: ViewGroup, layout: Int) : RecyclerView.ViewHolder(LayoutInflater
        .from(parent.context)
        .inflate(layout, parent, false)) {

    init {
        this.bindView(itemView)
    }


    abstract fun bindView(view: View)

    protected fun getContext(): Context {
        return itemView.context
    }

}