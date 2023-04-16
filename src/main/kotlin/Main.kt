fun main() {
    val rating: Int = 3
    val condition1: Boolean = rating == 1 || rating == 2

        when(rating){
        1,2 -> println("плохо")
        3 -> println("нормально")
        4 -> println("хорошо")
        5 -> println("отлично")
    }
}