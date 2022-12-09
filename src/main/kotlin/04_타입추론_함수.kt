/*
- type inferenece (타입 추론) : 변수나 함수들을 선언할 때나 연산이 이루어질 때 자료형을 코드에 명시하지 않아
코틀린이 자동으로 자료형을 추론해주는 기능, 값의 형태로 추론 가능
- var intArr ***:Array<Int>*** = arrayOf(1,2,3,4,5)
- var letter ***:String*** = "dd"

- 함수
- 코틀린에서는 함수 = 자료형이 결정된 변수라는 개념으로 접근


 */
fun main() {

    // 타입 추론 이렇게도 가능
    var a = 123
    var c = 12.45
    var e = true
    var h = 'c'

    println(add(5,5,6))

}

fun add(a:Int, b:Int, c:Int): Int {
    return a+b+c
}

// 단일 표현식 함수
fun singleAdd(a: Int, b: Int, c: Int) = a+b+c