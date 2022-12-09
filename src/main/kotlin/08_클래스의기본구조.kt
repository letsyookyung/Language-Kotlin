/*
- 속성(클래스의 고유값), 함수(기능 구현)
 */

fun main(){
    var a = Person("박보영", 1993)
    var b = Person("이유경", 1993)

    a.introduce()


}

class Person(var name:String, val birthYear:Int) {

    fun introduce(){
        println("안녕하세요. ${birthYear}년생 ${name}입니다.")

    }
}