package phrade.mod1.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import phrade.mod1.block.ModBlocks;
import phrade.mod1.block.custom.CannabisCropBlock;
import phrade.mod1.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WEED_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WEED_CROP);

        blockStateModelGenerator.registerCrop(ModBlocks.WEED_CROP, CannabisCropBlock.AGE, 0, 1, 2, 3, 4, 5, 6, 7, 8);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.BUD, Models.GENERATED);
        itemModelGenerator.register(ModItems.CANNABIS_SEEDS, Models.GENERATED);

        itemModelGenerator.register(ModItems.BUD, Models.GENERATED);
    }
}
