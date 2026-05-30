package games.brennan.playermob.forge;

import games.brennan.playermob.PlayerMob;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;

/**
 * Forge loader entrypoint. Receives the mod's {@link IEventBus} from
 * the Forge mod loader; defers all wiring to the common
 * {@link PlayerMob#init()} for now.
 *
 * <p>Per-loader Forge events (item registration, creative-tab events,
 * client-side renderer registration) will subscribe to {@code modBus}
 * once the entity is implemented (Gate 1).</p>
 */
@Mod(PlayerMob.MOD_ID)
public final class PlayerMobForge {

    public PlayerMobForge(IEventBus modBus) {
        PlayerMob.init();
    }
}
