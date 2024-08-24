package Exercícios.exercicio05

fun ex5(){
    println("\nQuantas vezes você deseja lançar o dado?")
    var qtd = readln().toInt()

    for( i in 1..qtd){
        var d1 = (1..6).random()
        var d2 = (1..6).random()
        var soma = d1 + d2

        println("$i° lançamento deu um total de $soma")

    }
}