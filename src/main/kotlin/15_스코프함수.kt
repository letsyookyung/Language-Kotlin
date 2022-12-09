/*
    1)람다함수: 여러줄로 표현 가능함, 마지막 값이 반환됨
    2)람다함수에 파라미터가 없다면? 실행할 구문들만 나열하면 됨
    3)파라미터가 하나뿐이라면? it 사용, 파마리터가 여러개라면 일일히 씀
        it으로 대체해서
    스코프 함수 : apply, run, with, also, let
        클래스의 인스턴스 -> scope 함수에서 불러와서 쓰면, 인스턴스의 속성이나 함수를 더 깔끔하게 분리하여 쓸 수 잇음
        1) apply : 처리가 끝나면 인스턴스를 반환. 인스턴스를 생성한 후 변수에 담기 전에 '초기화 과정'을 수행할 때 많이 쓰임
        2) run : 처리가 끝나면 최종갑을 반환. 람다함수처럼 쓰지만, 마지막 구문이 반환되여 변수에 할당됨,
                 이미 인스턴스가 만들어진 후에 인스턴스의 함수나 속성을 scope 내에서 사용해야할 떄 유용함
        => 참조연산자 없이 인스턴스의 변수와 함수를 사용할 수 있었다면
        --
        3) with : run과 동일한 기능을 가지지만 단지 인스턴스를 참조연산자 대신 패러미터로 받는다는 뿐
        --
        4) also : 처리가 끝나면 인스턴스를 반환.
        5) let : 처리가 끝나면 최종갑을 반환.
        => 마치 파라미터로 인스턴스를 넘긴것처럼, it을 통해서 인스턴스를 사용할 수 있음.
           왜 굳이? 이늰 같은 이름의 변수나 함수가 scope 바깥에 중복 되어 있는 경우에 혼란을 방지하기 위해서임


 */


fun main() {

    var price = 5000 // 이렇게하니 다 5000원으로 찍힘, 인스턴스 내의 price 속성보다, run이 속해있는 'main함수'의 price 변수를 우선시함

    val a:() -> Unit = {println("파마리터가 없어요")}

    var kotlin = Book("디모의 코틀린", 10000).apply {
        name = "[초특가]$name"
//        discount()
        println("apply: 상품명: ${name}, 가격: ${price}원")}
    // 원래 : a.name = "[초특가]" +  a.name
    // 원래 : a.discount()

    kotlin.run{
//        discount()
        println("run: 상품명: ${name}, 가격: ${price}원") }

    with(kotlin) {
//        discount()
        println("with: 상품명: ${name}, 가격: ${price}원")
    }

    kotlin.let {
        println("let: 상품명: ${it.name}, 가격: ${it.price}원")
    }


}

class Book(var name:String, var price: Int) {
    fun discount(){
        price -= 2000
    }
}