package br.com.brforgers.mods.industrialexpansion

import br.com.brforgers.mods.industrialexpansion.registry.ItemRegistry
import net.minecraft.item.ItemGroup
import net.minecraft.item.ItemStack
import net.minecraft.item.Items
import net.minecraftforge.fml.common.Mod
import org.apache.logging.log4j.Level
import org.apache.logging.log4j.LogManager
import org.apache.logging.log4j.Logger
import thedarkcolour.kotlinforforge.forge.MOD_CONTEXT

@Mod(IndustrialExpansion.ID)
object IndustrialExpansion {
    const val ID: String = "industrialexpansion"
    val LOGGER: Logger = LogManager.getLogger()
    val TAB: ItemGroup = object : ItemGroup("$ID.tab") {
        override fun createIcon(): ItemStack {
            return ItemStack(Items.DIAMOND)
        }
    }

    init {
        LOGGER.log(Level.INFO, "Armelin is Topper!")
        ItemRegistry.ITEMS.register(MOD_CONTEXT.getKEventBus())
    }
}