package com.vit123long.models

class GithubBot() {

    // Init the command ONLY when is ready to be used
    private val publishCommand: PublishCommand by lazy {
        initPublishCommand()
    }

    // Init the command ONLY when is ready to be used
    private val pingCommand: PingCommand by lazy {
        initPingCommand()
    }

    private fun initPublishCommand(): PublishCommand = PublishCommand()

    private fun initPingCommand(): PingCommand = PingCommand()

    fun setupPublishCommand() {
        publishCommand.config()
        publishCommand.run()
    }
}
