/*
- 반복문
    - 조건형 반복문
        - while
        - do~while : 반드시 한번은 do 내의 코드를 실행

    - 범위형 반복문
        - for 기본적으로 1을 증가
        - step 3, downTo 3
- 증감연산자
    - 전위연산자 ++a
    - 후위연산자 a++ : 다음 구문부터 사용한다

 */
fun main() {

    var a = 0
    while (a<5){
//        println(a++) // 0,1,2,3,4
        println(++a) //1,2,3,4,5

    }

    for (i in 0..9 step 3) {
        println(i)
    }




}