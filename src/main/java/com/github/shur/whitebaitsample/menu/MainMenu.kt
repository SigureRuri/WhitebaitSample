package com.github.shur.whitebaitsample.menu

import com.github.shur.whitebait.dsl.window
import com.github.shur.whitebait.inventory.InventoryUI
import com.github.shur.whitebait.inventory.window.SizedWindowOption
import com.github.shur.whitebaitsample.menu.category.Blocks
import com.github.shur.whitebaitsample.menu.category.Foods
import com.github.shur.whitebaitsample.menu.category.Others
import com.github.shur.whitebaitsample.menu.category.WeaponsAndArmors
import org.bukkit.ChatColor
import org.bukkit.Material
import org.bukkit.Sound

class MainMenu : InventoryUI {

    override val window by window(SizedWindowOption(3 * 9)) {

        title = "${ChatColor.RED}${ChatColor.BOLD}メインメニュー"

        onOpen {
            player.playSound(player.location, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1f, 0.8f)
        }

        defaultSlot {
            icon {
                type = Material.BLACK_STAINED_GLASS_PANE
                name = " "
            }
        }

        slot(10) {
            icon {
                type = Material.BRICKS
                name = "${ChatColor.GOLD}${ChatColor.BOLD}${ChatColor.UNDERLINE}ブロック"
                lore.add("${ChatColor.GRAY}ブロックを配布しています")
            }
            onClick {
                Blocks().openLater(player)
            }
        }

        slot(11) {
            icon {
                type = Material.APPLE
                name = "${ChatColor.LIGHT_PURPLE}${ChatColor.BOLD}${ChatColor.UNDERLINE}食料"
                lore.add("${ChatColor.GRAY}食料を配布しています")
            }
            onClick {
                Foods().openLater(player)
            }
        }

        slot(12) {
            icon {
                type = Material.DIAMOND_CHESTPLATE
                name = "${ChatColor.AQUA}${ChatColor.BOLD}${ChatColor.UNDERLINE}武器・防具"
                lore.add("${ChatColor.GRAY}武器・防具を配布しています")
            }
            onClick {
                WeaponsAndArmors().openLater(player)
            }
        }

        slot(13) {
            icon {
                type = Material.FLINT_AND_STEEL
                name = "${ChatColor.GREEN}${ChatColor.BOLD}${ChatColor.UNDERLINE}その他"
                lore.add("${ChatColor.GRAY}その他のアイテムを配布しています")
            }
            onClick {
                Others().openLater(player)
            }
        }

    }

}