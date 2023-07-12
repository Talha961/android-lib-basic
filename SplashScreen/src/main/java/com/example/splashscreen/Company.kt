package com.example.splashscreen

object Company {
    fun getName(yourName: String): String {
        return buildString {
            append(yourName)
            append(" works at Sofit Consultancy")
        }
    }
}