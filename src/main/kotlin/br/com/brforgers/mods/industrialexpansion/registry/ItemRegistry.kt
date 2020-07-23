package br.com.brforgers.mods.industrialexpansion.registry

import br.com.brforgers.mods.industrialexpansion.IndustrialExpansion
import net.minecraft.item.Item
import net.minecraftforge.registries.DeferredRegister
import net.minecraftforge.registries.ForgeRegistries


object ItemRegistry {
    val ITEMS: DeferredRegister<Item> = DeferredRegister.create(ForgeRegistries.ITEMS, IndustrialExpansion.ID)

    val COAL_BALL = ITEMS.register("coal_ball") { Item(Item.Properties().group(IndustrialExpansion.TAB)) }
    val COMPACT_COAL_BALL = ITEMS.register("compact_coal_ball") { Item(Item.Properties().group(IndustrialExpansion.TAB)) }
    val COAL_CHUNK = ITEMS.register("coal_chunk") { Item(Item.Properties().group(IndustrialExpansion.TAB)) }

}