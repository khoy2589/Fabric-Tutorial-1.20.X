package net.banana.tutorialmod.item;

import net.banana.tutorialmod.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.banana.tutorialmod.TutorialMod;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static ItemGroup TITANIUM_GROUP = Registry.register(Registries.ITEM_GROUP,
           new Identifier(TutorialMod.MOD_ID,"titanium"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.titanium"))
                    .icon(() -> new ItemStack(ModItems.TITANIUM)).entries((displayContext, entries) -> {
                        entries.add(ModItems.TITANIUM);
                        entries.add(ModItems.RAW_TITANIUM);

                        entries.add(Items.IRON_INGOT);

                        entries.add(ModBlocks.TITANIUM_BLOCK);
                        entries.add(ModBlocks.RAW_TITANIUM_BLOCK);

                    }).build());


    public static void registerItemGroups(){
        TutorialMod.LOGGER.info("Registering Item Groups for " + TutorialMod.MOD_ID);
    }
}
