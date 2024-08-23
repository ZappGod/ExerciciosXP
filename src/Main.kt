import kotlin.math.sqrt
import Objetos.*

fun main() {
    var opcao : Int

    do{
        print("\n1.Verificar se o número é primo\n2.Contar a quantidade de palavras\n3.Media de 5 alunos escolhidos\n4.Ordenar nomes de alunos em ordem alfabética\n5.Lançamento de dados\n0.Sair\nEscolha um dos exercicios acima: ")
        opcao = readln().toInt()

        when(opcao){
            1 -> ex1()
            2 -> ex2()
            3 -> ex3()
            4 -> ex4()
            5 -> ex5()
            0 -> println("Saindo do programa...")
            else -> println("Opção inválida!")
        }

    }while(opcao != 0)
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

fun ex3(){
    var alunos = mutableListOf<Alunos>()
    for(i in 1..5){
        print("\nDigite o nome do $i° aluno: ")
        var nome = readln()

        var notas = DoubleArray(3)
        for(j in notas.indices){
            print("Digite a ${j+1}° do aluno $nome: ")
            notas[j] = readln().toDouble()
        }

        var aluno = Alunos(nome, notas)
        alunos.add(aluno)
    }

    for(aluno in alunos){
        var media = aluno.notas.average()
        var result = if(media >= 7.0) "Aprovado!" else "Reprovado!"
        println("O aluno ${aluno.nome} com média $media esta $result")
    }

}

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