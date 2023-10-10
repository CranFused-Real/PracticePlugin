package me.cranfused.practiceplugin.commands

import net.kyori.adventure.text.Component
import net.kyori.adventure.text.format.TextColor
import net.kyori.adventure.text.format.TextDecoration
import org.bukkit.Material
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player
import org.bukkit.inventory.ItemStack
import org.bukkit.inventory.meta.ItemMeta

class EnderPearlBowCommand : CommandExecutor {
    override fun onCommand(p0: CommandSender, p1: Command, p2: String, p3: Array<out String>?): Boolean {
        if (p0 !is Player) return false
        if (!p0.isOp) {
            p0.sendMessage(Component.text("You do not have permission to perform this command!").color(TextColor.color(255, 0, 0)))
            return false
        }

        val enderPearlBowItem: ItemStack = ItemStack(Material.BOW)
        val itemMeta = enderPearlBowItem.itemMeta

        itemMeta.displayName(Component.text("EnderPearlBow").color(TextColor.color(130, 56, 130)).decorate(TextDecoration.BOLD))
        itemMeta.setCustomModelData(6969)

        enderPearlBowItem.itemMeta = itemMeta

        p0.sendMessage(Component.text("Successfully Given Ender Pearl Bow!").color(TextColor.color(0, 255, 40)))
        p0.inventory.addItem(enderPearlBowItem)

        return false
    }

}