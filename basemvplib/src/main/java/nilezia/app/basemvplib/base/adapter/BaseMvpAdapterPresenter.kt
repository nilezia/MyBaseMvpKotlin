package nilezia.app.basemvplib.base.adapter

import nilezia.app.basemvplib.base.adapter.item.BaseItem
import java.lang.ref.WeakReference

open class BaseMvpAdapterPresenter<A : BaseMvpAdapterContract.Adapter> : BaseMvpAdapterContract.Presenter<A> {

    private var adapter: WeakReference<A>? = null
    private var items: MutableList<BaseItem>? = null

    override fun setAdapter(adapter: A) {
        this.adapter = WeakReference(adapter)

    }

    override fun getAdapter(): A = adapter?.get() ?: throw(Throwable("View has null"))


    override fun getItemViewType(pos: Int): Int = getPrivateItems()[pos].getType()

    override fun getItemCount(): Int = getPrivateItems().size

    override fun hasItems(): Boolean = getItemCount() > 0


    private fun getPrivateItems(): MutableList<BaseItem> {
        items?.let {
            return it
        }
        return mutableListOf()
    }

    override fun setItem(items: MutableList<BaseItem>) {
        this.items = items

    }

    override fun getItem(position: Int): BaseItem = getPrivateItems()[position]

    override fun getItems(): MutableList<BaseItem> = getPrivateItems()
}