package solutions.s4y.amplitudedemo.analytics

import androidx.annotation.VisibleForTesting
import com.amplitude.api.Amplitude
import com.amplitude.api.Identify
import org.json.JSONObject
import solutions.s4y.amplitudedemo.TheApplication
import solutions.s4y.amplitudedemo.user.UserInterface

class AnalyticsDefault(application: TheApplication, user: UserInterface) : AnalyticsInterface {

    val amplitude = Amplitude
        .getInstance()
        .initialize(application, "0153903c2d0409eca74ba525788ef809")
        .enableForegroundTracking(application)

    init {
        setUser(user)
    }

    override fun setUser(user: UserInterface) {
        amplitude.userId = user.id
        val identify = Identify().set("gender", if (user.isMale) "male" else "female")
        amplitude.identify(identify)
    }

    @VisibleForTesting
    fun amplitudeEvent(name: String, props: JSONObject?) {
        amplitude.logEvent(name, props)
    }

    private fun amplitudeEvent(name: String) {
        amplitudeEvent(name, null)
    }

    override fun eventFabClick() {
        amplitudeEvent("FAB_CLICK")
    }

    override fun eventListItemSelect(itemId: String) {
        val props = JSONObject()
        props.put("itemID", itemId)
        amplitudeEvent("LIST_ITEM_CLICK", props)
    }
}