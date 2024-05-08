package com.example.lab1_ph31990

import java.lang.String.format

fun format(userName: String, domain: String) = "$userName@$domain"

fun main() {
    println(format("mario", "example.com"))
    println(format("domain.com", "username"))
    println(format(userName = "foo", domain = "bar.com"))
    println(format(domain = "frog.com", userName = "pepe"))
}