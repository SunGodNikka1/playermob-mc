package games.brennan.playermob.fabric;

import games.brennan.playermob.PlayerMob;
import net.fabricmc.api.ModInitializer;

/**
 * Fabric loader entrypoint. Defers all real wiring to {@link PlayerMob#init()}
 * in the common module so the same logic runs on every loader.
 *
 * <p>Referenced from {@code fabric.mod.json} under {@code entrypoints.main}.</p>
 */
public final class PlayerMobFabric implements ModInitializer {

    @Override
    public void onInitialize() {
        PlayerMob.init();
    }
}
