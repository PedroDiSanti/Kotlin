interface Lendable {
    fun borrowItem()
    fun returnItem()
}

abstract class Inventory (val title:String, val author:String, val genre:String, val year:Int, var isBorrowed:Boolean) : Lendable {
    override fun borrowItem(){
        if (!isBorrowed){
            isBorrowed = true
            println("O $genre $title foi emprestado.")
        }
        else {
            println("O $genre $title já foi emprestado.")
        }
    }
    
    override fun returnItem(){
        if (isBorrowed){
            isBorrowed = false
            println("O $genre $title foi devolvido.")
        }
        else {
            println("O $genre $title não foi emprestado.")
        }
    }
    
    override fun toString(): String{       
        return "Inventory(title='$title', author='$author', genre='$genre', year='$year', isBorrowed='$isBorrowed')"
    }
    
    abstract fun copy(): Inventory
}

class Book(title:String, author:String, genre:String, year:Int, isBorrowed:Boolean) : Inventory(title, author, genre, year, isBorrowed) {
    fun read(){
        println("Lendo $title por $author de $year.")
    }
    
    override fun copy(): Inventory {
        val copy = Book(title, author, genre, year, isBorrowed)
        copy.isBorrowed = this.isBorrowed
        
        return copy
    }
}

class DVD(title:String, author:String, genre:String, year:Int, isBorrowed:Boolean) : Inventory(title, author, genre, year, isBorrowed) {
    fun watch(){
        println("Assistindo $title por $author de $year.")
    }
    
    override fun copy(): Inventory {
        val copy = Book(title, author, genre, year, isBorrowed)
        copy.isBorrowed = this.isBorrowed
        
        return copy
    }
}

fun main(){
	val book = Book(title = "The Lord of the Rings", author = "J.R.R. Tolkien", genre= "Book", year = 1954, isBorrowed = false)
    book.read()
    
    val DVD = DVD(title = "The Lord of the Rings", author = "Peter Jackson", genre= "Movie", year = 2001, isBorrowed = false)
    DVD.watch()
}
