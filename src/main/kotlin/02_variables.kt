
// 2강 - 변수와 자료형
/*
- 기본 설명
  - //주석, /* 여러줄 */
  - 클래스명 대문자 시작
  - 함수 변수 카멜
- 변수 선언
  - var : 일반적으로 통용되는 변수, 언제든지 읽기 쓰기가 가능
  - val : 선언시에만 초기화 가능, 중간에 값을 변경할 수 없음, runtime 시 변경 안되도록
  - 클래스에 선언된 변수 : property
  - 이 외의 scope 내에 선언된 변수 : local variable
  - 처음에 선언할 수도 있고, var a : Int = 123
  - nullable , var a : Int? = null
  - lateinit
  - lazy
- 기본 자료형
  - 정수형
  - 실수형
  - 논리형
  - 문자열
 */
fun main(args: Array<String>) {

    // 변수
    var a : Int = 123
    var b : Int? = null

    //기본 자료형
    var value1: Int = 1234
    var value2: Long = 1234L
    // 등등

    // 문자형
    // 논리형
    // 문자열
    val lines = """
        hello, string
        keys능
    """

}
