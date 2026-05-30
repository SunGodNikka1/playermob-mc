package games.brennan.playermob.neoforge;

import games.brennan.playermob.PlayerMob;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

/**
 * NeoForge loader entrypoint. Receives the mod's {@link IEventBus} from
 * the NeoForge mod loader; defers all wiring to the common
 * {@link PlayerMob#init()} for now.
 *
 * <p>Per-loader NeoForge events (DeferredRegister items, creative-tab events,
 * client-side renderer registration via {@code EntityRenderersEvent})
 * will subscribe to {@code modBus} once the entity is implemented (Gate 1).</p>
 */
@Mod(PlayerMob.MOD_ID)
public final class PlayerMobNeoForge {

    public PlayerMobNeoForge(IEventBus modBus) {
        PlayerMob.init();
    }
}
