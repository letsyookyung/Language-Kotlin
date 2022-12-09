/*
    infix 함수
        - 클래스 안에서 infix 함수를 선언할 때에는 적용할 클래스가 자기 자신이므로
          클래스 이름은 쓰지 않습니다..?
 */

fun main() {

    println(6 multiply 4) // 좌측에 붙은 6이 infix함수가 적용되는 객체 자신 =this
    println(6.multiply(4)) // 같은거

}

infix fun Int.multiply(x: Int): Int = this * x