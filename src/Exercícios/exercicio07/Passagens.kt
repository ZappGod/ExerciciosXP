package Exercícios.exercicio07
import Exercícios.exercicio07.Objetos.Voo

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
            else -> println("Opção inválida!")
        }
    }while(opcao != 2)
}