/*


 */

fun main() {
    EventPrinter3().start()
}

interface EventListener3 {
    fun onEvent(count:Int)

}

// 속성으로 EventListener를 받는다
class Counter3(var Listener: EventListener) {

    fun count() {
        for (i in 1..100) {
            if (i%5 == 0) Listener.onEvent(i)
        }
    }

}

class EventPrinter3 {
    fun start(){ // 이 안에 익명 객체를 넘긴다
        val counter = Counter3(object: EventListener {
            override fun onEvent(count:Int) {
                print("${count}-")
            }
        })
        counter.count()
    }
}