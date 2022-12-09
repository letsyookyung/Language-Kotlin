/*
    - associateBy : 아이템에서 key를 추출하여 map으로 변환하는 함수
        ex) collection.associateBy{it.name} => name을 key로 해서 만들어줌
    - groupBy : key가 같은 아이템 끼리 배열로 묶어 map으로 만드는 함수
        ex) collection.groupBy{it.birthYear} => birthYear이 같은 것들끼리 배열로 묶은 map
    - partition : 아이템에 조건을 걸어, true/false인지에 따라 두 컬렉션으로 나눠줌, 두 객체를 pair로 담음
    - flatMap : 아이템마다 만들어진 컬렉션을 합쳐서 반환하는 함수
    - getOrElse : 인텍스 위치에 아이템이 있으면 아이템을 반환하고 아닌 경우 지정한 기본값을 반환하는 함수
    - zip : 컬렉션 두 개의 아이템을 1:1로 매칭하여 새 컬렉션을 만들어 줌, pair 클래스를 list에 담아 반환


 */

fun main() {

    data class Person(val name: String, val birthYear: Int)

    val personList = listOf(Person("아이비", 1992),
                            Person("베티", 1994),
                            Person("헤일리", 1998),
                            Person("베일리", 1993),
        )

    println(personList.associateBy { it.birthYear })
    println(personList.groupBy { it.name })
    println(personList.partition { it.birthYear >1993 })

    println("----")

    val numbers = listOf(-3,7,2,-10,1)

    println(numbers.flatMap { listOf(it*10, it+10) })
    println(numbers.getOrElse(1){"없음"})
    println(numbers.getOrElse(10){"없음"})

    val names = listOf("a","b", "c", "d")

    println(names zip numbers)




}
