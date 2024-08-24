package Exercícios.exercicio08
import Exercícios.exercicio08.Objetos.Produto

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