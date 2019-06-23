package solutions.s4y.amplitudedemo.analytics

import dagger.Module
import dagger.Provides
import solutions.s4y.amplitudedemo.TheApplication
import solutions.s4y.amplitudedemo.user.UserInterface
import javax.inject.Singleton

@Module
class DaggerAnalyticsModule {
    @Provides
    @Singleton
    fun provideAnalytics(application: TheApplication, user: UserInterface): AnalyticsInterface {
        return AnalyticsDefault(application, user)
    }
}