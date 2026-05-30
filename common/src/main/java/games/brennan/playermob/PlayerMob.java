package games.brennan.playermob;

import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

/**
 * Common mod entrypoint. Loader-specific entries
 * ({@code PlayerMobFabric}, {@code PlayerMobForge}, {@code PlayerMobNeoForge})
 * each call {@link #init()} during their bootstrap.
 *
 * <p>The actual entity registration, renderer wiring, and spawn-egg
 * registration land here behind Architectury's loader-agnostic registrars —
 * this scaffold is intentionally empty so the bootstrap commit can
 * compile and ship on all three loaders before any feature code lands
 * (Gate 1 — PlayerMobEntity).</p>
 */
public final class PlayerMob {

    public static final String MOD_ID = "playermob";

    private static final Logger LOGGER = LogUtils.getLogger();

    private PlayerMob() {}

    /**
     * Called once per JVM from each loader entry point.
     * Safe to call before the client renderer is registered — this
     * runs on both client and dedicated-server boots.
     */
    public static void init() {
        LOGGER.info("[{}] common init", MOD_ID);
    }
}
