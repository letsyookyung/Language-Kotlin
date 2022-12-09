/*
- return -> 값을 반환, 함수 끝
- break -> 즉시 반복문 끝내고 다음 구문으로
- continue -> 다음 반복조건

 - 다중 반복문에서 break/continue 반복문을 label을 통해
    -label을 달린 반복문을 기준으로 즉시 break 시켜줌

 - 논리 연산자 && || !

 */

fun main() {

    loop@for (i in 0..10 step 2) {
        for (j in 1..10) {
            if (i == 10) break@loop
            println("j: $i")
            if (j == 3) continue
            println(i)
        }
    }
}