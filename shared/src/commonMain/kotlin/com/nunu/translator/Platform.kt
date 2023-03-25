package com.nunu.translator

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform