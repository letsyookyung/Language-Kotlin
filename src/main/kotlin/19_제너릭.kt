/*
    제너릭 : 클래스나 함수에서 사용하는 자료형을 외부에서 지정할 수 있는 기능
            함수나 클래스를 선언할 때 고정적인 자료형 대신 실제 자료형으로 대체 되는
            타입 ㅍ
            모든 타입에 대해 동작을 하는 함수나 클래스, 어떤 타입에 관계없이 일반화하는 것



 */

fun main(){

    UsingGeneric(A()).doShouting()
    UsingGeneric(B()).doShouting()
    UsingGeneric(C()).doShouting()

    doShouting(B())

}

open class A {
    open fun shout() {
        println("A가 소리칩니다.")
    }
}

class B: A() {
    override fun shout() {
        println("B가 소리칩니다")
    }
}

class C: A() {
    override fun shout() {
        println("C가 소리칩니다")
    }
}

// 제너릭 클래스
class UsingGeneric<T: A> (val t: T) {

    fun doShouting() {
        t.shout()
    }
}

// 제너릭 함수
fun <T:A> doShouting(t:T) {
    t.shout()
}




