package me.cranfused.practiceplugin.listeners

import org.bukkit.entity.EnderPearl
import org.bukkit.entity.Player
import org.bukkit.event.Event
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.entity.EntityShootBowEvent

class BowShootListener : Listener{


    @EventHandler
    fun bowShootEvent(event: EntityShootBowEvent) {
        val entity = event.entity

        if (entity !is Player) return

        val bow = event.bow ?: return

        if(!bow.hasItemMeta()) return
        if(!bow.itemMeta.hasCustomModelData()) return
        if(bow.itemMeta.customModelData != 6969) return

        event.isCancelled = true
        val projectile = entity.launchProjectile(EnderPearl::class.java, event.projectile.velocity)

        projectile.shooter = entity

    }
}