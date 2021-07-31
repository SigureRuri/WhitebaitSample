package com.github.shur.whitebaitsample.menu.category

import org.bukkit.ChatColor
import org.bukkit.Material
import org.bukkit.inventory.ItemStack

class Others : Offer() {

    override val items = listOf(
        ItemStack(Material.FLINT_AND_STEEL, 1),
        ItemStack(Material.WOODEN_AXE, 1),
        ItemStack(Material.WOODEN_PICKAXE, 1),
        ItemStack(Material.WOODEN_SHOVEL, 1),
        ItemStack(Material.WOODEN_HOE, 1),
        ItemStack(Material.BUCKET, 1),
        ItemStack(Material.OAK_BOAT, 1)
    )

    override val title = "${ChatColor.GREEN}${ChatColor.BOLD}その他"

}