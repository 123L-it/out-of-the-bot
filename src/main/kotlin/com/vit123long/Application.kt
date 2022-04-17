package com.vit123long

import com.vit123long.models.GithubBot
import com.vit123long.models.enum.CommandAvailable
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import com.vit123long.plugins.*

fun main() {
    embeddedServer(Netty, port = 8080, host = "0.0.0.0") {
        configureRouting()
        exampleInitCommand()
    }.start(wait = true)
}

fun exampleInitCommand(){
    val bot = GithubBot()
    bot.setupPublishCommand()
}
