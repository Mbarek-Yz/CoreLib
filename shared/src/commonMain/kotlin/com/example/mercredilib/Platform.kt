package com.example.mercredilib

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform