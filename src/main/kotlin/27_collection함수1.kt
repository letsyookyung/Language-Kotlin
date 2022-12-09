/*
    편리하게 컬렉션 사용
    컬렉션 함수: 컬렉션 또는 배열에 일반함수, 람다함수를 사용해서
    - forEach - it
    - filter - it , 조건을 사용해서 원하는 것만
    - map - it , value 변경
    - any collection.any {} 하나라도 조건 맞에면 true 반환
    - all 모두 조건
    - none 하나도 조건에 맞지 않으면
    - first(=find) / last(=findLast) :
        - 일반함수일 떈 첫번째 인자 반환
        - {it-조건} 형태일땐 : 조건에 맞는 첫번째 아이템을 반환
        - 조건에 맞는 객체가 없는 경우 (=컬렉션이 비어있는 경우), NoSuchElementException
            - fisrtOrNull, lastOrNull => null 반환해줌
    - count
        - 일반함수일 땐 : 컬렉션의 모든 아이템의 개수 반환
        - {it-조건} : 조건에 맞는 아이템 개수만 알려줌


 */

fun main(){

    val nameList = listOf("ivy", "ron", "team")
    nameList.forEach{ print("$it^_^")}
    println()

    println(nameList.filter{it.startsWith("i")})

    println(nameList.map{"이름: ${it}"})

    println(nameList.any{it =="ron"})

    println(nameList.all{it.length==3})




}