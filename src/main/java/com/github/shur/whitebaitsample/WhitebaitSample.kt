package com.github.shur.whitebaitsample

import com.github.shur.whitebaitsample.listener.MenuListener
import org.bukkit.Material
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerInteractEvent
import org.bukkit.plugin.java.JavaPlugin

class WhitebaitSample : JavaPlugin(), Listener {

    override fun onEnable() {
        server.pluginManager.registerEvents(this, this)
        server.pluginManager.registerEvents(MenuListener(), this)
    }

    @EventHandler
    fun onClickCoal(event: PlayerInteractEvent) {
        if (!event.hasItem()) return
        if (event.item!!.type != Material.COAL) return
        SampleUI.open(event.player)
    }

}