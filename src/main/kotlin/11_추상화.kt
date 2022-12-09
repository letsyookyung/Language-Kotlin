/*
- 추상화 :
    - super 클래스에서는 선언부만 있고, 기능이 구현되지 않은 추상함수, 추상클래스
    - 반드시 sub클래스에서 구현됨
    - 추상함수 + 일반함수 + 속성 + 생성자

- 인터페이스 : 추상함수로만 이뤄지는 순수 추상화 기능
    - 추상함수 + 일반함수 + 속성
    - 구현부가 있는 함수 -> Open 함수로 간주
    - 구현부가 없는 함수 -> abstract 함수로 간주
    - 별도의 abstract, open 과 같은걸 안써두됨
    - 여러 인터페이스를 상속 시킬 수 있음

- 서브클래스에서는 혼선이 일어나지 않도록, override로

 */

fun main() {

    var a = Rabbit()
    a.sniff()
    a.eat()

    var b = Pig()
    b.eat()
    b.run()
    b.sniff()

}

abstract class Animal__{
    abstract fun eat()

    open fun sniff(){
        println("킁킁")
    }

}

class Rabbit: Animal__() {

    override fun eat() {
        println("풀떼기만 먹습니다.")
    }
    override fun sniff() {
        println("켕켕")
    }
}

interface Runner {
    fun run() // 구현부 없는
}

interface Eater {
    fun eat(){
        println("음식을 먹습니다")
    }
}

class Pig: Runner, Eater, Animal__() {
    override fun run() {
        println("우다다다 뜁니다")
    }

    override fun eat() {
        println("허겁지겁 먹습")
    }
}