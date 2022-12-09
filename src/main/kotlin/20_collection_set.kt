/*
 set: 순서 정렬 x, 중복이 허용되지 않는 컬렉션
    - Set, MutableSet 존재

 */

fun main(){

    val a = mutableListOf("귤", "바나나", "키위")

    for (item in a){
        println("${item}")
    }
    println()

    a.add("자몽")
    println(a)

    a.remove("바나나")
    println(a)

    println(a.contains("귤"))

}

