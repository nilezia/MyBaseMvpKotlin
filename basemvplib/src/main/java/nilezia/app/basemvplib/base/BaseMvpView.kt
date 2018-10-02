package nilezia.app.basemvplib.base

import nilezia.app.basemvplib.base.BaseMvpPresenter

interface BaseMvpView{

    fun getPresenter(): BaseMvpPresenter<*>

}