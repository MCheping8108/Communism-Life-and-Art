package com.plr.cla.common.util;

import com.plr.cla.common.CLA;
import com.plr.cla.common.item.food.FoodInit;
import com.plr.cla.common.item.init.ItemInit;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {
    public static final DeferredRegister<Block> Blocks = DeferredRegister.create(ForgeRegistries.BLOCKS, CLA.MODID);
    public static final DeferredRegister<Item> Items = DeferredRegister.create(ForgeRegistries.ITEMS, CLA.MODID);
    public static final IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

    public static void register(){
        //
        ItemInit.register();
        FoodInit.register();
        Blocks.register(eventBus);
        Items.register(eventBus);
    }
}