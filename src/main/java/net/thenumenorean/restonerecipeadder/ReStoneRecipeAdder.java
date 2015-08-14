package net.thenumenorean.restonerecipeadder;

import ic2.api.item.IC2Items;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = ReStoneRecipeAdder.MODID, version = ReStoneRecipeAdder.VERSION)
public class ReStoneRecipeAdder
{
    public static final String MODID = "restonerecipeadder";
    public static final String VERSION = "1.0.0";
    
    @EventHandler	
    public void postInit(FMLPostInitializationEvent event) {
		
    	GameRegistry.addRecipe(new ItemStack(IC2Items.getItem("reinforcedStone").getItem(),8), "aaa", "aba", "aaa",
				'a', new ItemStack(Blocks.stone),
				'b', IC2Items.getItem("advancedAlloy"));
    }
}
