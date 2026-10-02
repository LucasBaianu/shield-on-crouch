package me.lubanu.shieldoncrouch;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.world.item.Items;

public class ShieldOnCrouchClient implements ClientModInitializer {
	private boolean forcing = false;

	@Override
	public void onInitializeClient() {
		ClientTickEvents.END_CLIENT_TICK.register(mc -> {
			LocalPlayer player = mc.player;
			if (player == null) return;

			boolean want = player.isShiftKeyDown()
					&& player.getOffhandItem().is(Items.SHIELD);

			if (want) {
				mc.options.keyUse.setDown(true);
				forcing = true;
			} else if (forcing) {
				mc.options.keyUse.setDown(false);
				forcing = false;
			}
		});
	}
}
