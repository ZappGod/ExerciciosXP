import kotlin.math.sqrt
import Objetos.*

fun main() {
    var opcao : Int

    do{
        print("\n1.Verificação de Números Primos" +
                "\n2.Contagem de Palavras em um Texto" +
                "\n3.Gerenciamento de Notas dos Alunos" +
                "\n4.Ordenação de Nomes de Alunos" +
                "\n5.Simulação de Jogo de Dados" +
                "\n6.Análise de Dados Meteorológicos" +
                "\n7.Sistema de Reserva de Passagens Aéreas" +
                "\n8.Sistema de Gestão de Estoque com Reposição Automática" +
                "\n0.Sair" +
                "\nEscolha um dos exercicios acima: ")
        opcao = readln().toInt()

        when(opcao){
            1 -> ex1()
            2 -> ex2()
            3 -> ex3()
            4 -> ex4()
            5 -> ex5()
            6 -> ex6()
            7 -> ex7()
            8 -> ex8()
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

fun ex6(){
    var temps = DoubleArray(30)

    for(i in temps.indices){
        print("\nDigite a temperatuda do ${i+1}° dia: ")
        temps[i] = readln().toDouble()
    }

    var tempMedia = temps.average()
    var tempMax = temps.maxOrNull()
    var tempMin = temps.minOrNull()

    var diaTempMax = temps.indexOfFirst { it == tempMax } +1
    var diaTempMin = temps.indexOfFirst { it == tempMin } +1


    println("\nTemperatura média é de $tempMedia°C\nA maior temperatura registrada foi de $tempMax°C no dia $diaTempMax, e a menor foi de $tempMin°C no dia $diaTempMin")
}

fun ex7(){
    var voo = Voo(numeroDoVoo = (1..200).random(), assentosDisponiveis = IntArray(10))
    do{
        print("\n1.Reservar um assento para o voo número ${voo.numeroDoVoo}\n2.Sair\nEscolha:")
        var opcao = readln().toInt()
        when(opcao){
            1 ->{
                print("\nDigite um numero de 1 a 10 para verificar a disponibilidade: ")
                var assento = readln().toInt()
                if(voo.reservarAssento(assento)){
                    println("Assento $assento reservado com sucesso!")
                }else{
                    println("O assento $assento ja esta reservado!")
                }
            }
        }
    }while(opcao != 2)
}

fun ex8(){
    var produtos = mutableListOf<Produto>()

    for(i in 1..5){
        print("\nCadastro do $i° produto\nEscreva o nome do produto: ")
        var nome = readln()
        print("\nEscreva a quantidade do produto: ")
        var quantidade = readln().toInt()
        print("Escreva o nível mínimo do produto: ")
        var nivelMinimo = readln().toInt()
        print("Escreva o nível máximo do produto: ")
        var nivelMaximo =  readln().toInt()

        var produto = Produto(nome,quantidade,nivelMinimo,nivelMaximo)
        produtos.add((produto))
    }

    for(produto in produtos){
        if(produto.quantidade < produto.nivelMinimo){
            print("\nA quantidade de ${produto.quantidade} do produto ${produto.nome} está abaixo de ${produto.nivelMinimo}")
            produto.reporEstoque()
        } else{
            print("\nO produto ${produto.nome} esta com a quantidade ideial")
        }
    }
}