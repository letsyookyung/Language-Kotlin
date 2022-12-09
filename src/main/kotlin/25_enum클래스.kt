/*
    enum class : 열거형,


 */

fun main() {
    var state = State.SING
    println(state.message)
    println(state)

    state = State.SLEEP
    println(state.message)

    println(state.isSleeping())

    state = State.EAT
    println(state.message)
    println(state.isSleeping())



}

enum class State(val message: String) {
    SING("노래를 부릅니다"),
    EAT("밥을 먹습니다"),
    SLEEP("잠을 잡니다");

    fun isSleeping() = this == State.SLEEP


}