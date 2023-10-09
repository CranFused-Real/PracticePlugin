package me.cranfused.practiceplugin

import com.destroystokyo.paper.event.player.PlayerJumpEvent
import net.kyori.adventure.text.Component
import net.kyori.adventure.text.format.TextColor
import net.kyori.adventure.text.format.TextDecoration
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import kotlin.coroutines.coroutineContext

class PlayerJumpListener : Listener {


    @EventHandler

    fun playerJumpEvent(event: PlayerJumpEvent) {
        val player = event.player

        player.sendMessage(Component.text("You Jumped!").color(TextColor.color(255, 255, 2)).decorate(TextDecoration.BOLD))
    }
}