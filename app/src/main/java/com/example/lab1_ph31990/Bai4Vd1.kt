package com.example.lab1_ph31990

fun main() {
    var a = ""
    println("Nhập từ bất kỳ")
    var s = readLine()
    if (s != null) a = s.toString()

    println(describeString(a))

}

fun describeString(maybeString: String?): String {
    if (maybeString != null && maybeString.length > 0) {
        return "String of length ${maybeString.length}"
    } else {
        return "Empty or null string"
    }
}