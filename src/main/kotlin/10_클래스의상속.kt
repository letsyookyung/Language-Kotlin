/*
- 상속이 필요한 이유
    - 기존 클래스 + 알파, 쉽게 확장, 관리
- open class 로 해야지 상속을 받게 할 수 있음
- 상속 조건:
    - super 클래스에 존재하는 속성과 '같은 이름'의 속성을 가질 수 없음
    - sub 클래스가 생성될 때에는 반드시 super 클래스의 생성자까지 호출되어야 함
- 상속 받을 때, super 클래스의 생성자에 직접 넘겨주도록, 변수도 선언 하지 않음
 */

open class Animal(var name:String, var age:Int, var type:String) {

    fun introduce() {
        println("저는 ${type} ${name}이고, ${age}살 입니다.")
    }
}

class Dog (name:String, age:Int) : Animal(name,age,"개") {

    fun bark() {
        println("멍멍")
    }
}

class Cat(name: String,age:Int): Animal(name,age,"고양이"){

    fun bark() {
        println("미야옹")
    }


}
fun main() {

    var a = Animal("벤푸", 5, "개")
    var b = Dog("유경", 10)
    var c = Cat("까미", 7)


    a.introduce()
    b.introduce()
    b.bark()
    c.introduce()
    c.bark()

}