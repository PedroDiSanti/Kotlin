fun main() {
    var books = arrayListOf("The Lord of the Ring", "The Hobbit", "The Count of Monte Cristo", "Crime and Punishment")
    
    for (book in books){
        if (book.contains('e')){
            for(character in book){
                println(character)
            }
        }
        println()
    }
}
