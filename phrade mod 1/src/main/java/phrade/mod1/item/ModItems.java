package phrade.mod1.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import phrade.mod1.PhradeMod;
import net.minecraft.item.Item;
import phrade.mod1.block.ModBlocks;

public class ModItems {
    public static final Item BUD = registerItem("bud", new Item(new FabricItemSettings()));
    public static final Item CANNABIS_SEEDS = registerItem("cannabis_seeds", new AliasedBlockItem(ModBlocks.WEED_CROP, new FabricItemSettings()));

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(BUD);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(PhradeMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        PhradeMod.LOGGER.info("Registering mod items for " + PhradeMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS). register(ModItems::addItemsToIngredientItemGroup);
    }
}
