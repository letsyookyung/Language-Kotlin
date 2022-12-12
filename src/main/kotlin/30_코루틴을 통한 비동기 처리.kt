/*
    '비동기'로 여러개의 루틴을 동시에 처리할 수 있는 법

    메인루틴 - 코루틴

    코루틴은 제어범위 및 실행범위를 지정할 수 있음
    = 코루틴의 scope
        - global scope / coroutine scope (특정한 목적의 Dispatchers 지정하여 제어 및 동작이 가능한 범위)
        - dispatcher: Dispatchers.Default 기본적인 백그라운드동작
                      Dispatchers.IO I/O에 최적화 된 동작
                      Dispatchers.Main 메인 스레드에서 동작

        - val scope = CoroutineScope(Dispatcher.Defaunt)
        - 둘 다 람다 함수 형식으로:
        - val coroutineA = scope.launch{} - 반환값이 없는 job 객체
        - val coroutineB = scope.async{} - 반환값이 있는 deffered 객체, 마지막 값이 반환 됨
        - 코루틴은 제어되는 스코프 또는 프로그램 전체가 종료되면 함께 종료되기 때문에,
            코루틴이 끝까지 실행되는 것을 보장하려면 일정한 범위에서 코루틴이 모두 실행될 때까지
            잠시 기다려주어야 합니다.
        - runBlocking {
            launch{}
            async{}
          } 이렇게 runBlocking 블럭을 만들고, 코루틴이 끝날 때까지 main 루틴을 잠시 멈춰줌

        - 루틴을 잠시 대기 시키는 함수, runBlocking과 같은 루틴의 대기가 가능한 구문 안에서만 동작이 가능합니다
            - delay(milisecond: Long) : 밀리세컨드의 단위로 대기하는 함수
            - Job.join()
            - Deferred.await() : Job의 실행이 끝날 때까지 대기하는 함수, Deferred의 실행이 끝날 때까지 대기하는 함수


        - launch 키워드는 corutine builder, 코루틴 빌더 이다. 이 키워드는 새로운 코루틴을 만들고 코드를 병렬적으로 진행하게된다. 코드가 병렬적으로 진행되기에 Hello 라는 문자가 먼저 출력된 것이다. 그리고 1초후에 World! 가 출력된다.
        - delay 는 suspending function이다. 이 함수는 코루틴을 특정한 시간동안 중지 시킨다. 허나 다른 하위 코루틴들은 중지 시키지는 않는다.
        - runBlocking 또한  corutine builder, 코루틴 빌더 이다. 그리고 이 함수는 non-corutine 코드와 corutine 코드들의 중간다리 역할을 해 준다.

        - 코루틴 중간에 중단
            1) 코루틴 내부의 delay()함수 또는 yield()함수가 사용된 위치까지 수행된 뒤 종료
            2) cancel()로 인해 속성인 isActive가 false가 되므로 이를 확인하여 수동으로 종료함
        - 제한 시간 내에 수행되면 결과값을 안되면 null을 => withTimeoutOrNull



 */

import kotlinx.coroutines.*


fun main() {

    runBlocking {
        val a = launch{
                doWork()
            }
        }

        val b = async {
            "async 종료"
        }

        println("async 대기")
        println(b.await())

        println("launch 대기")
        a.join()
        println("launch 종료")
    }

suspend fun doWork() {
    for (i in 1..5) {
        println(i)
        delay(50L)
}




