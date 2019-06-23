package solutions.s4y.amplitudedemo

import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DaggerApplicationModule(private val application: TheApplication) {
    @Provides
    @Singleton
    fun provideApplication(): TheApplication {
        return application
    }
}