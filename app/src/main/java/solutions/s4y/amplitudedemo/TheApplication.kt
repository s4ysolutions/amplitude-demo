package solutions.s4y.amplitudedemo

import android.app.Application

class TheApplication : Application() {
    companion object {
        lateinit var dagger: AppComponent
            private set
    }

    protected fun prepareAppComponent(): AppComponent {
        return DaggerAppComponent.builder().build()
    }

    override fun onCreate() {
        super.onCreate()
        dagger = prepareAppComponent()
    }
}