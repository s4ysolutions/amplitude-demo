package solutions.s4y.amplitudedemo

import dagger.Component
import solutions.s4y.amplitudedemo.analytics.DaggerAnalyticsModule
import javax.inject.Singleton

@Singleton
@Component(modules = [DaggerAnalyticsModule::class])
interface AppComponent