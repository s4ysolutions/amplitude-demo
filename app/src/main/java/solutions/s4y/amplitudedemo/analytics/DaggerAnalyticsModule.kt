package solutions.s4y.amplitudedemo.analytics

import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DaggerAnalyticsModule {
    @Provides
    @Singleton
    fun provideAnalytics(): AnalyticsInterface {
        return AnalyticsDefault()
    }
}