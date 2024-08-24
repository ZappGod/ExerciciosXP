package Exercícios.exercicio07.Objetos

class Voo(var numeroDoVoo : Int, var assentosDisponiveis : IntArray) {

    fun reservarAssento(assento: Int): Boolean{
        if(assento in assentosDisponiveis.indices && assentosDisponiveis[assento] == 0){
            assentosDisponiveis[assento] = 1
            return true
        }
        return false
    }
}