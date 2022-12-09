/*
    data class : 데이터를 다루는데 최적화된 class
        - equals() : 내용의 동일성을 판단하는 거
        - hashcode() : 객체의 내용에서 고유한 코드를 생성하는 해쉬코드를 반환
        - toString() : 포함된 속성을 보기 쉽게 나타내는
        - copy() : 객체를 복사하여 똑같은 내용의 새 객체를 만드는,
                   파라미터가 있는 함수라면, 해당 파라미터를 교체하여 생성할 수도 있음
        - componentX() : 속성을 순서대로 반환하는, 사용자가 직접 호출하기보다는
                        이 내용을 자동으로 꺼내 쓸 수 있는 기능을 지원하기 위한 함수

 */

fun main() {

    val a = General("보영", 212)
    println(a == General("보영", 212))
    println(a.hashCode())
    println(a)
    println()

    val b = Data("루다", 306)
    println(b == Data("루다", 306))
    println(b.hashCode())
    println(b)
    println()


    println(b.copy())
    println(b.copy("아린"))
    println(b.copy(id=618))
    println()

    val list = listOf(Data("보영", 212),
                     Data("루다", 306),
                    Data("아린", 618) )

    for((a,b) in list) {
        println("${a}:${b}")
    }





}


class General(val name: String, val id: Int)

data class Data(val name: String, val id: Int)