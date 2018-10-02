package nilezia.app.basemvplib.base

interface BaseMvpPresenter<V : BaseMvpView> {

    fun attachView(view: V)

    fun detachView()

    fun getView():V

}