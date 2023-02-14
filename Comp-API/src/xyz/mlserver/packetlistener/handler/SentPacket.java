package xyz.mlserver.packetlistener.handler;

import xyz.mlserver.packetlistener.Cancellable;
import org.bukkit.entity.Player;

/**
 * @deprecated Please use {@link org.inventivetalent.packetlistener.handler.SentPacket}
 */
@Deprecated public class SentPacket extends Packet {

    @Deprecated
    public SentPacket(Object packet, Cancellable cancel, Player player) {
        super(packet, cancel, player);
    }

}