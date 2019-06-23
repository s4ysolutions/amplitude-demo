package solutions.s4y.amplitudedemo

import dagger.Component
import solutions.s4y.amplitudedemo.analytics.DaggerAnalyticsModule
import solutions.s4y.amplitudedemo.user.DaggerUserModule
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        DaggerApplicationModule::class,
        DaggerUserModule::class,
        DaggerAnalyticsModule::class
    ]
)

interface AppComponent {
    fun inject(listItemListActivity: ItemListActivity)
}