/*
  map : key-value
  MutableMap.MutableEntry 이런 구조임

  put
  remove

 */

fun main() {
    val a = mutableMapOf("청하" to "sparkling",
                            "지코" to "새삥",
                            "비비" to "나쁜x")

    for (entry in a) {
        println("${entry.key} ${entry.value}")
    }

    a.put("오마이걸","번지")
    a.remove("비비")

    println(a["지코"])

}

