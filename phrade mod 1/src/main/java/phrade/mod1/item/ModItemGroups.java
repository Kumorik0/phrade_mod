package phrade.mod1.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import phrade.mod1.PhradeMod;
import phrade.mod1.block.ModBlocks;

public class ModItemGroups {
    public static final ItemGroup PHRADE_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(PhradeMod.MOD_ID, "phrade"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.phrade"))
                    .icon(() -> new ItemStack(ModItems.BUD)).entries((displayContext, entries) -> {

                        entries.add(ModBlocks.WEED_BLOCK);

                        entries.add(ModItems.BUD);
                        entries.add(ModItems.CANNABIS_SEEDS);

                    }).build());

    public static void registerItemGroups() {
        PhradeMod.LOGGER.info( "Registering Item Groups for " + PhradeMod.MOD_ID);
    }
}
