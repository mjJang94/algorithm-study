package 집합과맵.회사에있는사람

fun main () {
    val n = readln().toInt()
    val inCompany = mutableSetOf<String>()

    repeat(n) {
        val (name, state) = readln().split(" ")
        if (state == "enter") {
            inCompany.add(name)
        }else {
            inCompany.remove(name)
        }
    }

    inCompany.sortedDescending().forEach { println(it) }
}