fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val doubledList = list.map { it * 2 }
    println(doubledList)

    val sum = list.sumOrNull() ?: 0
    println(sum)

    val emptyList = emptyList<Int>()
    val sumOfEmptyList = emptyList.sumOrNull() ?: 0
    println(sumOfEmptyList)
}