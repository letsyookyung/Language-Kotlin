/*
    클래스 안의 클래스 :
    1) 중첩 클래스 (nested class) :
        - 서로 각자 다른 클래스라고 볼 수 있고, outer class가 없어도 nested class만도 객체로 인스턴스화 할 수 있음
        - 외부 클래스 객체의 내용을 공유할 수 없음
    2) 내부 클래스 (inner class)
        - 혼자서 객체는 만들 수는 없고, 외부 객체가 만들어지지 않으면 접근할 수 없음
        - 외부 클래스 객체 내용을 같이 공유함

    => 클래스 간의 연계성을 표현하여 코드의 가독성 및 작성 편의성을 높여줌
 */

fun main(){

    Outer.Nested().introduce()

    val outer = Outer()
    val inner = outer.Inner()
//    val nested = outer.Nested() // 안됨

    println(outer.text)
//    println(outer.Nested().introduce()) //안됨

    inner.introduceInner()
    inner.introduceOuter()

    outer.text = "Changed outer class"
    inner.introduceOuter()


}

class Outer {
    var text = "outer class"

    class Nested {
        fun introduce() {
            println("nested class")
        }
    }

    inner class Inner {
        var text = "inner class"
        fun introduceInner() {
            println(text)
        }

        fun introduceOuter() {
            println(this@Outer.text)// outer class-inner class에 같은 이름의 속성이나 함수가 있다면, this@이 표시해서 명확히 해주면됨
        }

    }


}

