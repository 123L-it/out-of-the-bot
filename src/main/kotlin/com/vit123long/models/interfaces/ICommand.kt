package com.vit123long.models.interfaces

import com.vit123long.models.enum.CommandAvailable

interface ICommand {
    /**
     * Configure the specific command
     */
    fun config()
    /**
     * Run the specific command
     * return True if it was successful or False otherwise
     */
    fun run(): Boolean
}
