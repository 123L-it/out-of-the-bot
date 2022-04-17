package com.vit123long.models

import com.vit123long.models.enum.CommandAvailable
import com.vit123long.models.interfaces.ICommand

/**
 * Publish the result to the client
 * */
class PublishCommand() : ICommand {

    override fun config() {
        TODO("Not yet implemented")
    }

    override fun run(): Boolean {
        println("Publish command success")
        return true
    }


}
