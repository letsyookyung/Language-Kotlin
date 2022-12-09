/*
- 오버라이딩 :
    - super클래스에서 허용만 한다면, sub클래스에서도 super 클래스에 있는 같은 이름과 형태로 된 함수의 내용을 다시 구현할 수 있음

 */

fun main() {

    var t = Tiger()
    t.introduce("견과류","티거", 10)
    t.eat()

}

open class Animal_ {

    var type : String? = null
    var name : String? = null
    var age : Int? = null

    open fun eat() {
        println("음식을 먹습니다")
    }

    fun introduce(type:String, name:String, age:Int ) {
        this.type = type
        this.name = name
        this.age = age
        println("저는 ${this.type} ${this.name}이고, ${this.age}살 입니다.")
    }
}

class Tiger : Animal_() {

    override fun eat() {
        println("고기를 먹습니다.")
    }
}