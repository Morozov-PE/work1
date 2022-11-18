package com.example.myapplication

import com.example.myapplication.Herbivores
import com.example.myapplication.Predator

fun main() {
    // КОММЕНТ
    val herbivores1 = Herbivores("Свинья")
    val herbivores2 = Herbivores("Лошадь")

    val predator1 = Predator("Тигр")
    val predator2 = Predator("Лев")

    val listOfHerbivores: List<Herbivores> = listOf(herbivores1, herbivores2)
    val listOfPredator: List<Predator> = listOf(predator1, predator2)

    for (index in listOfHerbivores.indices) {
        println("Это животное травоядное - ${listOfHerbivores[index].name}")
    }

    for (index in listOfPredator.indices) {
        println("Это животное хищное - ${listOfPredator[index].name} ")
    }

}