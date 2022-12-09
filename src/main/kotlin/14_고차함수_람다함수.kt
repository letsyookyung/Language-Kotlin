/*
- 고차함수: 함수를 마치 클래스에서 만들어낸 '인스턴스'처럼 취급하는 방법
          함수를 '파라미터'로 넘겨줄 수도 있고, '결과값'으로 반환 받을 수도 있는 방법
- 람다함수: 일반함수와는 달리 그 자체가 고차함수이기 때문에 별도의 연산자 없이도 변수에 담을 수 있음
 = 함수를 일종의 변수로 사용할 수 있다는 편의성 있음,
 컬렉션의 조작이나 스코프 함수에 도움이 됨

 */

fun main() {
//    b(::a) // b(), function("b가 호출한")-> a(), str = "b가 호출한", println(str)
    val c: (String) -> Unit = {str:String -> println("$str 람다함수")} // =val a: (String) -> Unit = {str} // 이때의 str은 String으로 받아온 값을 람다함수 내에서 사용할 변수 이름
    //= val c = {str:String -> println("${str} 람다함수")}
    b(c)
}
fun a (str:String) {
    println("$str 함수 a")
}

fun b (function: (String)-> Unit) {
    function("b가 호출한")
}