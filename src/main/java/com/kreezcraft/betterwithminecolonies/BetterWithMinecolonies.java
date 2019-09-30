package com.kreezcraft.betterwithminecolonies;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("betterwithminecolonies")
public class BetterWithMinecolonies
{
    public static BetterWithMinecolonies instance;
    public static final String MODID = "betterwithminecolonies";

    public BetterWithMinecolonies() {
        instance = this;
        MinecraftForge.EVENT_BUS.register(this);
    }


    private void setup(FMLCommonSetupEvent event) { LOGGER.info("Setup of Better With Minecolonies Recipes is being loaded!"); }



    private void clientRegistries(FMLClientSetupEvent event) { LOGGER.info("ClientRegistries of Better With Minecolonies Recipes is being loaded!"); }



    private static final Logger LOGGER = LogManager.getLogger("Better With Minecoloniesrecipes");
}
