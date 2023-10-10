package me.cranfused.practiceplugin

import me.cranfused.practiceplugin.commands.EnderPearlBowCommand
import me.cranfused.practiceplugin.listeners.BowShootListener
import org.bukkit.plugin.java.JavaPlugin

class PracticePlugin : JavaPlugin() {
    override fun onEnable() {
        // Plugin startup logic
        logger.info("The Plugin has been loaded!")
        registerListener()
        registerCommand()

    }

    private fun registerListener() {

        // Registering Listener for PlayerJumpEvent
        server.pluginManager.registerEvents(PlayerJumpListener(), this)

        // Registering Listener for BowShootEvent
        server.pluginManager.registerEvents(BowShootListener(), this)

        logger.info("Registered Listener")
    }

    private fun registerCommand() {
        // Create an instance of your Launch class, which implements CommandExecutor
        val launchCommand = Launch()
        // Create an instance of your EnderPearlBowCommand class, which implements CommandExecutor
        val enderPearlBowCommand = EnderPearlBowCommand()


        // Register the /jump command and set its executor to the Launch class instance
        getCommand("jump")?.setExecutor(launchCommand)
        // Register the /ender-pearl-bow command and set its executor to the EnderPearlBowCommand class instance
        getCommand("ender-pearl-bow")?.setExecutor((enderPearlBowCommand))


        logger.info("Registered the Command!")
    }


    override fun onDisable() {
        // Plugin shutdown logic
        logger.info("The Plugin has been unloaded!")
    }
}
