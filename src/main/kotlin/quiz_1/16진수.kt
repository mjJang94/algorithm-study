package org.example.quiz_1


/**
 * input - A
 * output - 10
 * 16진수 수는 0~9와 A~F로 이루어져 있고, A~F는 10~15를 뜻한다. 또, 이 수는 음이 아닌 정수이다.
 */

fun getDecimalNumber() {
    val br = System.`in`.bufferedReader()
    println(br.readLine().toInt(16))
}