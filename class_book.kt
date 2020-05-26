class Book (val title:String, val author:String, val year:Int, var isBorrowed:Boolean){
    fun borrowBook(){
        if (!isBorrowed){
            isBorrowed = true
            println("O livro foi emprestado.")
        }
        else {
            println("O livro já foi emprestado.")
        }
    }
    
    fun returnBook(){
        if (isBorrowed){
            isBorrowed = false
            println("O livro foi devolvido.")
        }
        else {
            println("O livro não foi emprestado.")
        }
    }
    
    fun printBook(){
        println("Title: $title")
        println("Author: $author")
        println("Year: $year")
        if (isBorrowed){
        	println("Is the book borrowed? Yes")    
        }
        else {
            println("Is the book borrowed? No")    
        }
        
    }
}

fun main(){
    val book = Book(
        "The Lord of The Rings", 
        "J.R.R Tolkien", 
        1954, 
        false
    )
   
    book.returnBook()
    book.borrowBook()
    book.borrowBook()
    book.returnBook()
    book.printBook()
}
