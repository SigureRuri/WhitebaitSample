package com.github.shur.whitebaitsample.menu.category

import org.bukkit.ChatColor
import org.bukkit.Material
import org.bukkit.inventory.ItemStack

class Blocks : Offer() {

    override val items = listOf(
        ItemStack(Material.STONE, 64),
        ItemStack(Material.GRASS, 64),
        ItemStack(Material.BRICKS, 64),
        ItemStack(Material.GLASS, 64),
        ItemStack(Material.BLACK_CONCRETE, 64)
    )

    override val title = "${ChatColor.GOLD}${ChatColor.BOLD}ブロック"

}