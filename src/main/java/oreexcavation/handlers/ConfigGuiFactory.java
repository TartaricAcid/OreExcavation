package oreexcavation.handlers;

import java.util.Set;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.fml.client.IModGuiFactory;
import oreexcavation.client.GuiOEConfig;

public class ConfigGuiFactory implements IModGuiFactory
{
	@Override
	public void initialize(Minecraft minecraftInstance)
	{
	}

	@Override
	public Class<? extends GuiScreen> mainConfigGuiClass()
	{
		return GuiOEConfig.class;
	}

	@Override
	public Set<RuntimeOptionCategoryElement> runtimeGuiCategories()
	{
		return null;
	}
	
	@Override
	@SuppressWarnings("deprecation")
	public RuntimeOptionGuiHandler getHandlerFor(RuntimeOptionCategoryElement element)
	{
		return null;
	}
}
