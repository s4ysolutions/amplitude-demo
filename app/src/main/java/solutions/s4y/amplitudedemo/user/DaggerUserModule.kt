package solutions.s4y.amplitudedemo.user

import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DaggerUserModule {
    @Singleton
    @Provides
    fun provideUser(): UserInterface {
        return UserDefault()
    }
}