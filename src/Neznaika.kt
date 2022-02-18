object Neznaika : Human(), Customer, TableOwner {
    override var ownedTable: Table? = null
//    override fun getOrder(): Order {
//        return Order(arrayOf(Food.PASTA_WITH_CHEESE, Food.SOUP, Food.CABBAGE_ROLLS, Food.ICECREAM), arrayOf(Drink.COFFEE))
//    }
    override fun getOrder() = Order(arrayOf(Food.PASTA_WITH_CHEESE, Food.SOUP, Food.CABBAGE_ROLLS, Food.ICECREAM), arrayOf(Drink.COFFEE))
    override fun toString() = "Незнайка"
    class Emotion{
        companion object{@JvmStatic
        fun joy(){
            println ("От радости ему хотелось запеть или сделать кому-нибудь что-нибудь очень приятное!")
            class NegativeAmotion{
                fun Empty(){}
            }
            }
        }
    }
}
