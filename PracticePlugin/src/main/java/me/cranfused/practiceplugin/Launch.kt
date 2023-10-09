package me.cranfused.practiceplugin

import net.kyori.adventure.text.Component
import net.kyori.adventure.text.format.TextColor
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player
import org.bukkit.util.Vector

class Launch : CommandExecutor {
    override fun onCommand(p0: CommandSender, p1: Command, p2: String, p3: Array<out String>?): Boolean {
        if (p0 is Player) {
            if (p0.isOp) {
                p0.sendMessage("You have Successfully Jumped")
                p0.velocity = p0.velocity.add(Vector(0.0, 10.0, 0.0))
            }
            else {
                p0.sendMessage(Component.text("You do not have permission to use this command!").color(TextColor.color(255, 0, 0)))
            }
        }
        return false
    }
}