/*
 - 오브젝트 :
    - 생성자 없이 객체를 직접 만들어 내는 것, 생성자 ex) var a = Person("박보영", 1993)
    - 기존 클래스는 단지 인스턴스 객체를 만들기 위한 '틀'이기 때문에, 내부에 있는 속성이나 함수를
      사용하려면 생성자를 통해 실체가 되는 인스턴스 객체를 만들어야 했음
    - 여러개의 객체를 만들 필요가 없고, 단 하나의 객체로 공통적인 속성과 함수를 사용해야하는 코드에서는 굳이 클래스 안써두됨
    - singleton pattern : 클래스의 인스턴스를 단 하나만 만들어 사용하도록 하는 코딩 아키텍쳐 패턴
    - Companion Object : 기존 클래스 내에도 object를 만들 수 있음
        - 클래스의 인스턴스 기능은 사용 +
        - 공용 속성 및 함수 를 별도로 만든다, = static 멤버와 비슷


 */

fun main() {

//    println(Counter.count)
//
//    Counter.countUp()
//    Counter.countUp()
//    println(Counter.count)
//
//    Counter.clear()
//    println(Counter.count)

    var a = FoodPoll("짜장")
    var b = FoodPoll("짬뽕")

    for (i in 0..10) {
        if (i%3 == 0) {
            a.vote()
            continue}
        b.vote()
    }

    println("총 ${FoodPoll.total}명이 참여했으며, " +
            "짜장면은 ${a.count}명, 짱뽕은 ${b.count}명이 투표했음")


}
class FoodPoll (val name:String) {

    companion object {
        var total = 0
    }

    var count = 0

    fun vote() {
        total++
        count++
    }
 }


object Counter {
    var count = 0

    fun countUp() {
        count++
    }

    fun clear() {
        count = 0
    }
}
