package nilezia.app.basemvplib.base.adapter

import nilezia.app.basemvplib.base.adapter.item.BaseItem

interface BaseMvpAdapterContract {

    interface Adapter {
        fun getPresenter(): Presenter<*>

        fun notifyDataSetChanged()

        fun notifyItemInserted(index: Int)

        fun notifyItemRemoved(index: Int)
    }

    interface Presenter<A : Adapter> {
        fun setAdapter(adapter: A)

        fun getAdapter(): A

        fun getItemViewType(pos: Int): Int

        fun getItemCount(): Int

        fun hasItems(): Boolean

        fun setItem(items: MutableList<BaseItem>)

        fun getItem(position: Int): BaseItem

        fun getItems(): MutableList<BaseItem>
    }
}