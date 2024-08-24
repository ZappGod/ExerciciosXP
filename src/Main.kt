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
            1 -> Exercícios.exercicio01.ex1()
            2 -> Exercícios.exercicio02.ex2()
            3 -> Exercícios.exercicio03.ex3()
            4 -> Exercícios.exercicio04.ex4()
            5 -> Exercícios.exercicio05.ex5()
            6 -> Exercícios.exercicio06.ex6()
            7 -> Exercícios.exercicio07.ex7()
            8 -> Exercícios.exercicio08.ex8()
            0 -> println("Saindo do programa...")
            else -> println("Opção inválida!")
        }

    }while(opcao != 0)
}