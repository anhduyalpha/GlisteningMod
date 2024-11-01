package net.duy.glistening.tabs;

import net.duy.glistening.GlisteningMod;
import net.duy.glistening.item.GlisteningItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class CreativeItemTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, GlisteningMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> WEAPON_TAB = CREATIVE_MODE_TABS.register("weapontab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(GlisteningItems.BEAR.get()))
                    .title(Component.translatable("creativetab.weapon_tab"))
                    .displayItems((pParameters, pOutput) -> {

                        pOutput.accept(GlisteningItems.BEAR.get());
                        pOutput.accept(Items.DIAMOND);




                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
