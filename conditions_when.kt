import java.util.*

fun main() {
    val random = Random().nextInt(50) + 1
    
    when(random){
    	in 1..10 -> println("The number $random is between 1 and 10.")
        in 11..20 -> println("The number $random is between 11 and 20.")
        in 21..30 -> println("The number $random is between 21 and 30.")
        in 31..40 -> println("The number $random is between 31 and 40.")
        else -> println("The number $random is greater than 40.")
    } 
}
