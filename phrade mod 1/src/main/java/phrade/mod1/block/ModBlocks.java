package phrade.mod1.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import phrade.mod1.PhradeMod;
import phrade.mod1.block.custom.CannabisCropBlock;
import phrade.mod1.item.ModItemGroups;

public class ModBlocks {

    public static final Block WEED_BLOCK = registerBlock("weed_block",
            new Block(FabricBlockSettings.copyOf(Blocks.HAY_BLOCK)));

    public static final Block WEED_CROP = Registry.register(Registries.BLOCK, new Identifier(PhradeMod.MOD_ID, "weed_crop"),
            new CannabisCropBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));


    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(PhradeMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(PhradeMod.MOD_ID, name), block);
    }

    public static void registerModBlocks() {
        PhradeMod.LOGGER.info("Registering blocks for " + PhradeMod.MOD_ID);
    }
}
