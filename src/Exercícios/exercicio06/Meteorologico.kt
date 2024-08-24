package Exercícios.exercicio06

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