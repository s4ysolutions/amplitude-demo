package solutions.s4y.amplitudedemo.user

import kotlin.math.floor

val uids = arrayOf("one", "two", "three")

fun randomUid(): String {
    return uids[(floor(Math.random() * 3)).toInt()]
}

class UserDefault : UserInterface {
    override var id = randomUid()
    override var isMale = Math.random() > 0.5
    override fun change() {
        id = randomUid()
        isMale = Math.random() > 0.5
    }
}