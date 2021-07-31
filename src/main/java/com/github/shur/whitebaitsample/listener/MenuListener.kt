package com.github.shur.whitebaitsample.listener

import com.github.shur.whitebaitsample.menu.MainMenu
import org.bukkit.Material
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerInteractEvent

class MenuListener : Listener {

    @EventHandler
    fun onClickPaper(event: PlayerInteractEvent) {
        if (!event.hasItem()) return
        if (event.item!!.type != Material.PAPER) return

        MainMenu().open(event.player)
    }

}