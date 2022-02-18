import kotlin.random.Random

abstract class Human {
    override fun hashCode() = super.hashCode()
    override operator fun equals(other: Any?) = this === other
    class Shorties {
        companion object {
            @JvmStatic
            fun look() =
                    Random.nextInt(1, 3)
        }
    }
}