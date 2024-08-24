package Exercícios.exercicio02

fun ex2(){
    print("\nEscreva uma frase: ")
    val texto : String = readln()
    val palavra = texto.split(" ").count()
    println("A frase tem $palavra palavras")
}