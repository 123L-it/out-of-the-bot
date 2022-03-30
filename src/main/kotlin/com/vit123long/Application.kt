package com.vit123long

import io.ktor.server.engine.*
import io.ktor.server.netty.*
import com.vit123long.plugins.*

fun main() {
    embeddedServer(Netty, port = 8080, host = "0.0.0.0") {
        configureRouting()
    }.start(wait = true)
}
