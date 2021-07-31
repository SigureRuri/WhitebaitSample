package com.github.shur.whitebaitsample.menu.category

import com.github.shur.whitebait.dsl.window
import com.github.shur.whitebait.inventory.InventoryUI
import com.github.shur.whitebait.inventory.window.SizedWindowOption
import com.github.shur.whitebaitsample.menu.MainMenu
import com.github.shur.whitebaitsample.menu.ReceiptConfirmation
import org.bukkit.ChatColor
import org.bukkit.Sound
import org.bukkit.event.inventory.InventoryType
import org.bukkit.inventory.ItemStack

abstract class Offer : InventoryUI {

    abstract val items: List<ItemStack>

    abstract val title: String

    override val window by window(SizedWindowOption(6 * 9)) {

        title = "${this@Offer.title} ${ChatColor.DARK_GRAY}| 画面外クリックで戻る"

        onOpen {
            player.playSound(player.location, Sound.BLOCK_END_PORTAL_FRAME_FILL, 1f, 0.1f)
        }
        onClose {
        }
        onClick {
            if (event.slotType == InventoryType.SlotType.OUTSIDE) {
                MainMenu().openLater(player)
            }
        }

        items.forEachIndexed { index, itemStack ->
            slot(index) {
                icon(itemStack) {}
                onClick {
                    ReceiptConfirmation(itemStack.clone(), this@Offer).openLater(player)
                }
            }
        }

    }

}