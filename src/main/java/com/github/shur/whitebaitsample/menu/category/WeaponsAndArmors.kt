package com.github.shur.whitebaitsample.menu.category

import org.bukkit.ChatColor
import org.bukkit.Material
import org.bukkit.inventory.ItemStack

class WeaponsAndArmors : Offer() {

    override val items = listOf(
        ItemStack(Material.LEATHER_HELMET, 1),
        ItemStack(Material.LEATHER_CHESTPLATE, 1),
        ItemStack(Material.LEATHER_LEGGINGS, 1),
        ItemStack(Material.LEATHER_BOOTS, 1),
        ItemStack(Material.WOODEN_SWORD, 1),
        ItemStack(Material.BOW, 1),
        ItemStack(Material.ARROW, 16)
    )

    override val title = "${ChatColor.AQUA}${ChatColor.BOLD}武器・防具"

}