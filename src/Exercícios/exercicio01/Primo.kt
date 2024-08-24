package Exercícios.exercicio01

import kotlin.math.sqrt

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