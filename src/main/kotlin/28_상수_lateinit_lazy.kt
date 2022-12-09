/*
 - 변수 var/val
    val은 할당된 객체를 바꿀 수 없을 뿐이지, 객체 내부의 속성을 변경할 수 없는 것은 아님
 - 상수 : 절대 변경 불가능한 것, 컴파일 시점에 결정되어 const val = 기본 자료형만
        companinon object에 선언되어, 객체의 생성과 관계없이 고정된 값으로만 사용함, 대문자_언더바
        늘 고정되는 건 상수로 사용해서 성능 향상
 - lateinit : 일단 변수만 , 초기값 할당 나중에, 초기값 할당 전까지 변수를 사용할 수 없음, 기본 자료형에는 x
    ex) ::a.isInitialized

  - lazy : 변수를 사용하는 시점까지 초기화를 늦춰주는, 사용되면 바로 초기화시킴
           val a:Int by lazy {7}
           람다형식으로 여러 줄이 들어가도 됨(어차피 마지막 값이 할당됨)

 */

fun main() {

    val foodCourt = FoodCourt()

    foodCourt.searchPrice("크림파스타")
    foodCourt.searchPrice(FoodCourt.PIZZA)
    foodCourt.searchPrice(FoodCourt.STEAK)
    foodCourt.searchPrice("술")

    println("-----")

    val a = LateInitSample()

    println(a.getLateInitText())

    a.text  ="바보"
    println(a.getLateInitText())

    println("----")

    val number:Int by lazy{
            println("초기화를 합니다")
            7
    }

    println("코드를 시작합니다")
    println(number)
    println(number) //이땐 초기화 안함



}
class FoodCourt {
    fun searchPrice(foodName: String) {

        val price = when (foodName) {
            CREAM_PASTA -> 13000
            STEAK -> 390000
            PIZZA -> 100000
            else -> "가격없음"
        }

        println("${foodName}의 가격은 ${price}입니다.")
    }

    companion object{
        const val CREAM_PASTA = "크림파스타"
        const val STEAK = "스테이크"
        const val PIZZA = "피자"

    }
}


class LateInitSample{
    lateinit var text:String

    fun getLateInitText(): String {
        if (::text.isInitialized) {
            return text
        } else{
            return "기본값"
        }
    }

}