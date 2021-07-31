package com.github.shur.whitebaitsample

import com.github.shur.whitebait.dsl.window
import com.github.shur.whitebait.inventory.InventoryUI
import com.github.shur.whitebait.inventory.window.TypedWindowOption
import org.bukkit.ChatColor
import org.bukkit.Material
import org.bukkit.Sound
import org.bukkit.enchantments.Enchantment
import org.bukkit.event.inventory.ClickType
import org.bukkit.event.inventory.InventoryType

object SampleUI : InventoryUI {

    override val window by window(TypedWindowOption(InventoryType.HOPPER)) {

        title = "Whitebait UI"

        onOpen {
            player.playSound(player.location, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1f ,1f)
        }

        onClose {
            player.playSound(player.location, Sound.ENTITY_ARROW_HIT_PLAYER, 1f, 1f)
        }

        defaultSlot {
            icon {
                type = Material.GRAY_STAINED_GLASS_PANE
                name = " "
            }
        }

        slot(0) {
            icon {
                type = Material.DIAMOND
                name = "${ChatColor.GOLD}${ChatColor.BOLD}購入"
                enchantments[Enchantment.ARROW_INFINITE] = 1
            }
            onClick {
                if (clickType == ClickType.DOUBLE_CLICK) return@onClick

                player.playSound(player.location, Sound.ENTITY_PLAYER_LEVELUP, 1f ,1f)
                player.sendMessage("アイテムを購入しました。")
            }
        }

        slot(4) {
            icon {
                type = Material.BARRIER
                name = "${ChatColor.RED}${ChatColor.BOLD}キャンセル"
            }
            onClick {
                if (clickType == ClickType.DOUBLE_CLICK) return@onClick

                player.playSound(player.location, Sound.BLOCK_STONE_PLACE, 1f ,1f)
                player.sendMessage("購入をキャンセルしました。")
            }
        }
    }

}