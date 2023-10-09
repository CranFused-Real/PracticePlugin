package me.cranfused.practiceplugin

import org.apache.maven.model.Plugin
import org.bukkit.plugin.java.JavaPlugin

class PracticePlugin : JavaPlugin() {
    override fun onEnable() {
        // Plugin startup logic
        logger.info("The Plugin has been loaded!")
        registerListener()
        registerCommand()
    }

    private fun registerListener() {
        server.pluginManager.registerEvents(PlayerJumpListener(), this)

        logger.info("Registered Listener")
    }

    private fun registerCommand() {
        // Create an instance of your Launch class, which implements CommandExecutor
        val launchCommand = Launch()

        // Register the /jump command and set its executor to the Launch class instance
        getCommand("jump")?.setExecutor(launchCommand)

        logger.info("Registered the Command!")
    }


    override fun onDisable() {
        // Plugin shutdown logic
        logger.info("The Plugin has been unloaded!")
    }
}
