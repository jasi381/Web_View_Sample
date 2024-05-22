package com.example.webviewsample

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform