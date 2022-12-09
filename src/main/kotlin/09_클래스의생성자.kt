/*
- 생성자contructor : 새로운 인스턴스를 만들기 위해 호출하는 특수한 함수
    - 인스턴스의 속성을 초기화 + 인스턴스 생성시 구문을 수행
  - 다양한 방법으로 인스턴스를 생성하는 법을 제시함으로써 편의 제공
- 클래스를 만들 때 기본으로 선언 : 기본 생성자
- 필요에 따라 추가적으로 선언 : 보조 생성자
 */

fun main() {

    var a = PersonConstructor("이유경", 1993)

    var b = PersonConstructor("박보영")
    var c = PersonConstructor("이찬혁")

}

class PersonConstructor(var name:String, val birthYear:Int) {
    init{
        println("안녕하세요. ${this.birthYear}년생 ${this.name}입니다.")
    }

    //보조 생성자, 초기화
    constructor(name:String) : this(name, 1997) {
        println("보조 생성자가 사용되었습니다.")

    }

}