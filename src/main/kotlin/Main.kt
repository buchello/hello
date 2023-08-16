import kotlin.random.Random
fun main() {
    val rand = Random(1 )
    val arraySize = 10
    val array = IntArray(arraySize)
    for (i in 0 until arraySize) {
        array[i] = rand.nextInt(37)
    }
    println(array.contentToString())

}

