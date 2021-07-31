package com.github.shur.whitebaitsample.menu

import com.github.shur.whitebait.dsl.window
import com.github.shur.whitebait.inventory.InventoryUI
import com.github.shur.whitebait.inventory.window.TypedWindowOption
import org.bukkit.ChatColor
import org.bukkit.Material
import org.bukkit.Sound
import org.bukkit.enchantments.Enchantment
import org.bukkit.event.inventory.ClickType
import org.bukkit.event.inventory.InventoryType
import org.bukkit.inventory.ItemStack

class ReceiptConfirmation(
    private val item: ItemStack,
    private val backMenu: InventoryUI
) : InventoryUI {

    override val window by window(TypedWindowOption(InventoryType.HOPPER)) {

        title = "${ChatColor.RED}${ChatColor.BOLD}${ChatColor.UNDERLINE}受け取り確認"

        onOpen {
            player.playSound(player.location, Sound.BLOCK_END_PORTAL_FRAME_FILL, 1f, 0.1f)
        }

        slot(0) {
            icon {
                type = Material.DIAMOND
                name = "${ChatColor.GOLD}${ChatColor.BOLD}受け取る"
                enchantments[Enchantment.ARROW_INFINITE] = 1
            }
            onClick {
                if (clickType == ClickType.DOUBLE_CLICK) return@onClick

                player.playSound(player.location, Sound.ENTITY_PLAYER_LEVELUP, 1f ,1f)
                player.sendMessage("アイテムを受け取りました。")

                player.inventory.addItem(item)

                player.closeInventory()
            }
        }

        slot(2) {
            icon(item) {}
        }

        slot(4) {
            icon {
                type = Material.BARRIER
                name = "${ChatColor.RED}${ChatColor.BOLD}キャンセル"
            }
            onClick {
                if (clickType == ClickType.DOUBLE_CLICK) return@onClick

                backMenu.openLater(player)
            }
        }

    }

}