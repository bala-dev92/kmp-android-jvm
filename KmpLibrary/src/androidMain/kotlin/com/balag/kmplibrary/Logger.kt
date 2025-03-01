package com.balag.kmplibrary

import android.util.Log

actual fun printMessageFromPlatform(message: String){
    Log.d("::Android", message)
}