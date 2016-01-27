package com.gmail.mcrayjason.infinitycore.init;

import cpw.mods.fml.common.registry.GameRegistry;
import crazypants.enderio.EnderIO;
import gregtech.api.enums.GT_Values;
import gregtech.api.enums.Materials;
import gregtech.api.enums.OrePrefixes;
import gregtech.api.util.GT_OreDictUnificator;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class Recipes
{
    public static void registerRecipes()
    {
        // Crafting Recipes
        GameRegistry.addRecipe(new ShapedOreRecipe (new ItemStack(ModItems.itemMaterial, 1, 0),
                "swf",
                's', "craftingToolSaw",
                'w', "plateWood",
                'f', "craftingToolFile"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.itemMaterial, 9, 1), "ingotEnderiumBase"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack (EnderIO.itemPowderIngot, 1, 6),
                "nnn",
                "nnn",
                "nnn",
                'n', "nuggetEnderiumBase"));

        // Smelting Recipes
        GameRegistry.addSmelting(new ItemStack(ModItems.itemCluster, 1, 1),(GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.Beryllium, 2L)), 0F);
        GameRegistry.addSmelting(new ItemStack(ModItems.itemCluster, 1, 2),(GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.Cobalt, 2L)), 0F);
        GameRegistry.addSmelting(new ItemStack(ModItems.itemCluster, 1, 4),(GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.Molybdenum, 2L)), 0F);
        GameRegistry.addSmelting(new ItemStack(ModItems.itemCluster, 1, 7),(GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.Nickel, 2L)), 0F);
        GameRegistry.addSmelting(new ItemStack(ModItems.itemCluster, 1, 9),(GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.Platinum, 2L)), 0F);
        GameRegistry.addSmelting(new ItemStack(ModItems.itemCluster, 1, 10),(GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.Thorium, 2L)), 0F);
        GameRegistry.addSmelting(new ItemStack(ModItems.itemCluster, 1, 12),(GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.Uranium235, 2L)), 0F);
        GameRegistry.addSmelting(new ItemStack(ModItems.itemCluster, 1, 13),(GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.Uranium, 2L)), 0F);
        GameRegistry.addSmelting(new ItemStack(ModItems.itemCluster, 1, 14),(GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.Zinc, 2L)), 0F);
        GameRegistry.addSmelting(new ItemStack(ModItems.itemCluster, 1, 15),(GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.Tin, 4L)), 0F);

        // GregTech Processing Recipes
        GT_Values.RA.addChemicalRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Silver, 1L), GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Platinum, 1L), Materials.Tin.getMolten(288), Materials.EnderiumBase.getMolten(576), null, 100, 300);

    }
}
