package Exercícios.exercicio04

fun ex4(){
    var nomes = mutableListOf<String>()
    for(i in 1..10){
        print("\nDigite o nome do $i° aluno: ")
        var nome = readln()
        nomes.add(nome)
    }
    nomes.sort()
    println("Nomes em ordem alfabética: $nomes")
}