/*
- 형변환(type casting) : 하나의 변수에 지정된 자료형을 호환되는 다른 자료형으로 변경하는 기능
- 형변환 함수
    - toByte(), toShort(), toChar(), toFloat() 등
    - 명시적 형변환 (explicit type casting) <-> 암시적 형변환
        변환될 자료형을 개발자가 직접 지정함

- 배열 : Array<T>
    - var intArr = arrayOf(1,2,3,4,5)
    - var nullArr = arrayOfNulls<Int>(5)


 */
fun main(){

    // 형변환
    var a: Int = 54321
    var b: Long = a.toLong()

    // 배열
    var intArr = arrayOf(1,2,3,4,5)
    print(intArr)

    var nullArr = arrayOfNulls<Int>(5)
    println(nullArr)

    nullArr[2] = 8
    println(nullArr[2])

}