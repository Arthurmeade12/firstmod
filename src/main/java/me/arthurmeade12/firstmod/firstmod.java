package me.arthurmeade12.firstmod;

import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class firstmod implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod name as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger FirstMod = LoggerFactory.getLogger("First Mod");
	public static final Item VIVALAVIDA = new Item(new QuiltItemSettings());
	Registry.register(Registries.ITEM, new Identifier(mod.metadata().id(), "vivalavida"), VIVALAVIDA);
	@Override
	public void onInitialize(ModContainer mod) {
		FirstMod.info("Hello Quilt world from {}!", mod.metadata().name());
	}
}
