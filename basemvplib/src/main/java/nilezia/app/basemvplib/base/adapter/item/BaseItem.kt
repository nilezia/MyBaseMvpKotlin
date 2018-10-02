package nilezia.app.basemvplib.base.adapter.item

open class BaseItem(private val type: Int) {

    fun getType(): Int {
        return type
    }
}