package Exercícios.exercicio08.Objetos

class Produto(var nome : String,var quantidade : Int,var nivelMinimo : Int, var nivelMaximo : Int) {
    fun reporEstoque(){
        quantidade = nivelMaximo
        print("\nO produto $nome foi reposto para $quantidade")
    }
}