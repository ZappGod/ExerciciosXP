package Exercícios.exercicio03
import Exercícios.exercicio03.Objetos.Alunos

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