import kotlin.random.Random

fun main() {
    val negativeAmountCafe = readLine()!!.toInt()
    if (negativeAmountCafe <= 2) {
        throw CafeNegativeAmountException()
    }
    val cafe: Array<FoodLine> = Array(negativeAmountCafe) { if (Random.nextBoolean()) Cafe() else Canteen() }
    println("Есть ${cafe.size} кафе и столовых, в которых есть ${cafe.sumOf { O -> O.tables.size }} стола(ов)")
//    val cafe1 = cafe[Random.nextInt(cafe.size)]
//    cafe1.tables[Random.nextInt(cafe1.tables.size)]
    lateinit var cafe1: Table
    while (true) {
        cafe1 = cafe.random().tables.random()
        if (!cafe1.busy) {
            break
        }
    }
    println("Стол выбран!")
    cafe1.ownIt(Neznaika)
    println("Незнайка занял себе стол.")
    cafe1.waiter.takeOrder(Neznaika)
    println("Незнайка сделал заказ у официанта.")
    println("Супчик заказн)")
    when (Human.Shorties.look()){
        1 -> {println("Незнайка насытился \n Незнайка говорит:Что ж, здесь вполне хорошо!")
        Neznaika.Emotion.joy()}
        2 -> println("Незнайка не насытился \n Незнайка говорит:Здесь не очень хорошо!")
    }
}