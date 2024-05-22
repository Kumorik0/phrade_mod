package phrade.mod1;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import phrade.mod1.item.ModItems;

public class PhradeMod implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("phrademod");
	public static final String MOD_ID = "phrademod";

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}