/*
- 비교 연산자
- is 연산자, a is Int(확인할 자료형)

- 다중 연산자 (when, 여러개값 비교)
 */

fun main() {
    var a = 7
    if (a>10) {
        println("false")
    } else {
        println("true")
    }

    doWhen(1)
    doWhen("바보")
    doWhenExpression(1)
    doWhenExpression(10)

}

fun doWhen(a: Any) {

    when(a) {
        1 -> println("정수")
        "dino" -> println("문자")
        is Long -> print("long")
        !is String -> println("string")
        else -> println("아무것도 아님")
    }
}

fun doWhenExpression(a: Any) {

    var result = when(a) {
        1 -> "정수입니닼"
        else -> "아님"
    }

    println(result)
}