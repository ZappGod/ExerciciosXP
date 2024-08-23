import kotlin.math.sqrt

fun main() {
    var opcao : Int

    do{
        print("\n1.Exercício 1\n2.Exercício 2\n3.sair \nEscolha um dos exercicios acima:")
        opcao = readln().toInt()

        when(opcao){
            1 -> ex1()
            2 -> ex2()
            3 -> println("\nSaindo do programa...")
            else -> println("Opção inválida!")
        }

    }while(opcao != 3)
}

fun ex1(){

    fun verificaPrimo(num: Int): Boolean{
        if(num <= 1) return false

        for(i in 2..sqrt(num.toDouble()).toInt()){
            if(num % i == 0) return false
        }
        return true
    }


    print("\nInforme um valor para verificar se é primo: ")
    val num : Int = readln().toInt()
    if(verificaPrimo(num)){
        println("$num é um número primo")
    } else{
        println("$num não é um número primo")
    }
}

fun ex2(){
    print("\nEscreva uma frase: ")
    val texto : String = readln()
    val palavra = texto.split(" ").count()
    println("A frase tem $palavra palavras")
}