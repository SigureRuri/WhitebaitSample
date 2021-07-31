package com.github.shur.whitebaitsample.menu.category

import org.bukkit.ChatColor
import org.bukkit.Material
import org.bukkit.inventory.ItemStack

class Foods : Offer() {

    override val items = listOf(
        ItemStack(Material.APPLE, 16),
        ItemStack(Material.BREAD, 16),
        ItemStack(Material.COOKED_BEEF, 16),
        ItemStack(Material.MUSHROOM_STEW, 1)
    )

    override val title = "${ChatColor.LIGHT_PURPLE}${ChatColor.BOLD}食料"

}