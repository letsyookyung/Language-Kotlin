/*
 - 다형성의 개념
     Up-Casting : 콜라 인스턴스를 음료 변수에 담는 행위, 상위 자료형인 슈퍼클래스로 변환한다고 하여,Up-Casting
                   하위 클래스가 상위 클래스화 되는 것, 축소의 개념

     Down-Casting :Up-Casting된 인스턴스를 다시 하위 자료형으로 변환하면 Down-Casting
                   상위 클래스가 하위 클래스로 되는것, 확장의 개념
                - as : 변수를 호환되는 자료형으로 변환해주는 캐스팅 연산자
                - is : 변수가 자료형에 호환되는지를 먼저 체크한 후 변환 해주는 캐스팅 연산자, 조건문 안에서 쓰임
                 Cola클래스는 Drinks클래스보다 메소드가 하나 더 있으며, Drink()함수 또한 오버라이드를 통해 기능이 확장 됐다.
                따라서 Drinks클래스는 자신보다 더 커 버린 Cola클래스를 담을 수 없다

 */

fun main() {
    var a = Drink()
    a.drink()

    var b:Drink = Cola() //b Drink의 인스턴스이지만, Cola의 인스턴스를 담았으므로,
    b.drink() // override한 drink 함수는 Cola의 것을 가져옴
//    b.washDishes // 하지만, b는 Drink의 인스터이니깐, Cola 인스턴스의 함수는 못 불러옴

    // 그럴때는
    if (b is Cola){ // 잠시 다운 캐스팅시켜서
        b.washDishes()
    }

    var c = b as Cola //(다운 캐스팅한것을 변수에 할당)
    c.washDishes()
    b.washDishes() // as 써서 다운 캐스팅하면, 반환값 뿐만 아니라,변수 자체도 다운캐스팅 됨

}

open class Drink {
    var name = "음료"

    open fun drink() {
        println("$name 을 마십니다.")
    }

}

class Cola: Drink() {
    var type = "콜라"

    override fun drink() {
        println("$name 중에 $type 을 마십니다.")
    }

    fun washDishes() {
        println("${type}로 설거지를 합니다.")
    }

}