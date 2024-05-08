package com.example.lab1_ph31990

fun main() {
    print("Nhập giá trị của x: ")
    val input = readLine()
    val x = input?.toInt() ?: 0
    if (x in 1..5) {
        print("x is in range from 1 to 5")
    }
    println()

    if (x !in 6..10) {
        print("x is not in range from 6 to 10")
    }
}