package com.balag.kmplibrary

actual fun printMessageFromPlatform(message: String){
    println("::Jvm$message")
}