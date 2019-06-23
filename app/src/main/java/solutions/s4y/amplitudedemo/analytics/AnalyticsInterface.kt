package solutions.s4y.amplitudedemo.analytics

import solutions.s4y.amplitudedemo.user.UserInterface

interface AnalyticsInterface {
    fun setUser(user: UserInterface)
    fun eventFabClick()
    fun eventListItemSelect(itemId: String)
}