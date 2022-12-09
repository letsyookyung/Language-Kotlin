/*
    '비동기'로 여러개의 루틴을 동시에 처리할 수 있는 법

    메인루틴 - 코루틴

    코루틴은 제어범위 및 실행범위를 지정할 수 있음
    = 코루틴의 scope
        - global scope / coroutine scope (특정한 목적의 Dispatchers 지정하여 제어 및 동작이 가능한 범위)
        - dispatcher: Dispatchers.Default 기본적인 백그라운드동작
                      Dispatchers.IO I/O에 최적화 된 동작
                      Dispatchers.Main 메인 스레드에서 동작

        - val scope = CoroutineScope()
 */