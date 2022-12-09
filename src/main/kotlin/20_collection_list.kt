/*
    List : '데이터를 모아 관리'하는 collection class 를 상속받는 sub class 중 하나
    + Set, Map
            여러개의 데이터를 원하는 순서로 넣어 관리
            - List<out T> : 생성시에 넣은 객체를 대체,추가,삭제할 수 xxx
            - MutableList<T> : 변할 수 있는 리스트
 */

fun main() {

    var a = listOf("사과", "딸기", "수박")
    println(a[1])

    println()

    var b = mutableListOf(6,3,1)
    println(b)

    b.add(4)
    println(b)


}