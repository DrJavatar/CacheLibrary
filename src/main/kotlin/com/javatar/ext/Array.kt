package com.javatar.ext

fun <T : Any> Array<T?>.isJustNulls() : Boolean {
    return filterNotNull().none { it != "null" }
}