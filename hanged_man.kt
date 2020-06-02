fun main(args: Array<String>){
    print("Digite a palavra: ")
    val word = readLine()
    
    if(word == null){
        println("Nenhuma palavra digitada!")
        return
    }
    
    for(i in 1..100){
        println()
    }
    
    val letters = word.toLowerCase().toCharArray().toHashSet()
    val correctGuess = mutableSetOf<Char>()
    var fails = 0
    
    while(letters != correctGuess){
        guessLetter(word, correctGuess)
        println("\n#Letras erradas: $fails\n")
        
        print("Escolha a letra: ")
        val input = readLine()
        
        if(input == null){
            continue
        } else if(input.length != 1){
            println("Digite uma letra.")
            continue
        }
        
        if(word.toLowerCase().contains(input.toLowerCase())){
            correctGuess.add(input[0].toLowerCase())
        } else {
            fails++
        }
        
        guessLetter(word, correctGuess)
        println("\n#Letras erradas: $fails\n\n")
    }
}

fun guessLetter(word: String, correctGuess: Set<Char>){
    for(character in word.toLowerCase()){
        if(correctGuess.contains(character)){
            print(character + " ")
        } else {
            print("_ ")
        }
    }
}
