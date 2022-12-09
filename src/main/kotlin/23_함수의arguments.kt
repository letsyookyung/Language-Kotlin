/*
 overloading : 같은 scope 안에서 같은 이름의 함수를 여러개 만들 수 있는 기능
               - 이름이 같더라도, 파라미터의 자료형이 다르거나, 개수가 다르거다면 => 서로 다른 함수로
               - 그런데, 별다른 파라미터를 받지 않아도 되는 함수의 경우에는?
               - default arguments
               - named arguments
               - variable number of arguments (vararg), 배열처럼 들어감, 다른 유형의 파라미터랑 같이 쓰면
                 맨 마지막에 위치해야한다는 것~


 */


fun main() {
    read(7)
    read("감사합니닷")

    deliveryItem("짬뽕")
    deliveryItem("책", 3)
    deliveryItem("노트북", 30, "학교")

    sum(1,2,3,4)

}

fun read(x: Int) {
    println("숫자 ${x}입니다")
}

fun read(x: String) {
    println(x)
}

fun deliveryItem(name:String, count:Int=1,destination: String="집" ) {
    println("${name}, ${count}개를 ${destination}에 배달하였습니다.")
}

fun sum(vararg numbers: Int) {
    var sum = 0

    for (n in numbers) {
        sum +=n
    }

}