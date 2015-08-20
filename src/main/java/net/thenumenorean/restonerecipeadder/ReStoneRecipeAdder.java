package net.thenumenorean.restonerecipeadder;

import ic2.api.item.Items;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = ReStoneRecipeAdder.MODID, version = ReStoneRecipeAdder.VERSION, dependencies = "required-after:IC2;")
@NetworkMod(clientSideRequired = true)
public class ReStoneRecipeAdder
{
    public static final String MODID = "restonerecipeadder";
    public static final String VERSION = "1.0.2";
    
    @EventHandler	
    public void postInit(FMLPostInitializationEvent event) {
		
    	GameRegistry.addRecipe(new ItemStack(Items.getItem("reinforcedStone").getItem(),8), "aaa", "aba", "aaa",
				'a', new ItemStack(Block.stone),
				'b', Items.getItem("advancedAlloy"));
    }
}
