/*

    1) null 여부
    참조연산자를 실행하기 전에 먼저 객체가 null인지 확인하고,
    ?. : null safe operator, null이면 따라오는 구문 실행 x
    ?: : elvis operator, null이면 default울 써야겠다

    참조연산자를 실행하기 전, 컴파일 시 null여부를 확인하지 않도록 하여,
    런타임 시 null pointer exception이 나도록 의도적으로 방치하는 연산자임
    !!. :  non-null assertion operator,


    2) 동일성 체크
    - 내용의 동일성 ==
    - 객체의 동일성 : 메모리상 같은 객체를 가리키고 있을 때 ===


 */


fun main() {

    var a : String? = "kotlin Exam"

//    println(a?.toUpperCase())
//    println(a?:"null임".toUpperCase())
//    println(a!!.toUpperCase())

    a?.run{
        println(toUpperCase())
        println(toLowerCase())
    } // 이렇게도 null 여부를 확인할 수 있음

    var cola = Product("콜라", 1000)
    var cola2 = Product("콜라", 1000)
    var cola3 = cola
    var cola4 = Product("사이다", 1000)

    println(cola==cola2) // true
    println(cola===cola2) // false

    println(cola==cola3) //true
    println(cola===cola3) //true



}


class Product(val name: String, val price: Int) {
    override fun equals(other: Any?): Boolean {
        if (other is Product) {
            return other.name == name && other.price == price
        } else {
            return false
        }

    }
}
