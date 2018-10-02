package nilezia.app.basemvplib.base.adapter

import android.support.v7.widget.RecyclerView

@Suppress("CAST_NEVER_SUCCEEDS", "LeakingThis")
abstract class BaseMvpListAdapter<VH : BaseViewHolder, P : BaseMvpAdapterContract.Presenter<*>>
    : RecyclerView.Adapter<VH>(), BaseMvpAdapterContract.Adapter {

    private var mPresenter: P?

    abstract fun createPresenter(): P

    init {
        mPresenter = this.createPresenter()


    }

    override fun getPresenter(): P = mPresenter ?: throw Throwable("Presenter has null")

}