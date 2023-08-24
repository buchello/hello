import kotlin.random.Random

val listCirculation: MutableList<Circulation> = mutableListOf()
fun main() {
    for (i in 1..100) {
        val uniqueNumbers = mutableListOf<Int>()
        while (uniqueNumbers.size < 8) {
            val list = Random.nextInt(1, 36)
            if (list !in uniqueNumbers) {
                uniqueNumbers.add(list)
            }
        }
        listCirculation.add(Circulation(i, uniqueNumbers))
    }
        listCirculation.forEach {
            println("${it.id}${it.listInt}")
        }
    }

class Circulation(val id: Int, val listInt: MutableList<Int>)


