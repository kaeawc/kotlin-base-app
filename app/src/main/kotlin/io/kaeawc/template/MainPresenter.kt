package io.kaeawc.template

import java.lang.ref.WeakReference

class MainPresenter {

    var weakView: WeakReference<View>? = null

    fun onCreate(view: View) {
        weakView = WeakReference(view)
    }

    fun onResume() {
        weakView?.get()?.showTitle(R.string.main_title)
    }

    fun onPause() {
        weakView?.clear()
    }

    fun onStop() {
        weakView = null
    }

    interface View {

        fun showTitle(stringRes: Int)
    }
}