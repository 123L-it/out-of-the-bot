package com.vit123long

import com.vit123long.models.GithubBot
import com.vit123long.plugins.configureRouting
import io.ktor.server.engine.embeddedServer
import io.ktor.server.netty.Netty

fun main() {
    embeddedServer(Netty, port = 8080, host = "0.0.0.0") {
        configureRouting()
        exampleInitCommand()
    }.start(wait = true)
}

fun exampleInitCommand() {
    val bot = GithubBot()
    bot.setupPublishCommand()
}
