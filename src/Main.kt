fun main() {

    //Задача 1
    val list = listOf("one", "two", "three")
    println("Пример работы решения задачи 1:\n" + reverseStringListValues(list))

    //Задача 2
    val numbers = listOf(1, 2, 3, 4, 5)
    val newNumbers = numbers.filter { it < 4 }.map { it * it }
    println("Решение задачи 2:\n$newNumbers")

    //Задача 3
    val colors = listOf("red", "blue", "white")
    val russianColors = listOf("красный", "синий", "белый")
    val colorsWithTranslation = colors.zip(russianColors) { original, translated ->
        "Значение: $original, перевод: $translated"
    }
    println("Решение задачи 3:\n$colorsWithTranslation")

    //Задача 4
    println("Пример работы решения для задачи 4: " +
            countLettersInList(listOf("Jan", "Feb", "Mar", "Apr", "May")))
}

//Функция для задачи 1
fun reverseStringListValues(list: List<String>): List<String> {
    val newList = mutableListOf<String>()
    list.forEach { newList.add(it.reversed()) }
    return newList
}

//Функция для задачи 4
fun countLettersInList(list: List<String>) = list.reduce { acc, s -> acc + s }.length