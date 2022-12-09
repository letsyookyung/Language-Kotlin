/*
 -Observer(감시자) : '이벤트가 일어나는 것을 감시'하는 감시자의 역할을 만든다
    ex) 키의 입력, 터치의 발생, 데이터의 수신 등
    함수로 직접 요청하지 않았지만, 시스템 또는 루틴에 의해서 발생하는 동작들 = '이벤트'
    '이벤트'들이 '즉각적으로 처리'할 수 있도록 만드는 프로그래밍 패턴
    - 두 개의 클래스가 필요
        - 이벤트의 발생 및 전달 클래스 B :
                1) "이벤트가 발생했습니다!!" 3) "네 알겠습니닷!"
        - 이벤트를 수신 클래스 A :
                2) "함수를 불러라"

        그런데 문제가 있음
        - 이벤트의 발생 및 전달 클래스 B :
                2) "버튼 대령이오!"
                4) "쇤네가 주인님을 어떻게 부릅니까?"

                1-1) "이제 클릭되면 종을 울리겠습니다"


          + 인터페이스를 끼워줌 = observer , 코틀린에서는 listener
            이벤트를 넘겨주는 행위를 = callback

        - 이벤트를 수신 클래스 A :
                1) 클릭이 발생하는 버튼이 필요한데.. 그래 '버튼 인스턴스를 만들자!"
                   "B()는 와보거라!"
                3) "이제부터 클릭하면 알려주거라"

                2-1) "그거 좋구나 종은 내가 만들어두마"


 */

// EventPrinter(class) -> EventListener(interface) <- Counter(class)
fun main() {
    EventPrinter().start()
}

interface EventListener {
    fun onEvent(count:Int)

}

// 속성으로 EventListener를 받는다
class Counter2(var Listener: EventListener) {

    fun count() {
        for (i in 1..100) {
            if (i%5 == 0) Listener.onEvent(i)
        }
    }

}

// 상속 받는다
class EventPrinter: EventListener {
    override fun onEvent(count:Int) {
        println("${count}-")
    }

    fun start() {
        val counter = Counter2(this)// EventListener의 구현부를 넘겨줌,
        // this는 EventPrinter 객체 자신을 나타내지만, 받는 쪽에서 'EventListener'만 요구했기 때문에,
        // EventListener 구현부만 넘겨주게 됨
        // = 객체지향의 다형성
        counter.count()
    }


}