package oreexcavation.client;

import oreexcavation.core.OreExcavation;
import org.lwjgl.input.Keyboard;
import cpw.mods.fml.client.registry.ClientRegistry;
import net.minecraft.client.settings.KeyBinding;

public class ExcavationKeys
{
	public static final KeyBinding excavateKey = new KeyBinding(OreExcavation.MODID + ".key.excavate", Keyboard.KEY_GRAVE, OreExcavation.NAME);
	public static final KeyBinding shapeKey = new KeyBinding(OreExcavation.MODID + ".key.shape", Keyboard.KEY_Z, OreExcavation.NAME);
	
	public static void registerKeys()
	{
		ClientRegistry.registerKeyBinding(excavateKey);
		ClientRegistry.registerKeyBinding(shapeKey);
	}
}
