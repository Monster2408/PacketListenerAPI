package de.mlserver.packetlistener.handler;

import de.mlserver.packetlistener.Cancellable;
import org.bukkit.entity.Player;

/**
 * @deprecated Please use {@link org.inventivetalent.packetlistener.handler.ReceivedPacket}
 */
@Deprecated public class ReceivedPacket extends Packet {

    @Deprecated
    public ReceivedPacket(Object packet, Cancellable cancel, Player player) {
        super(packet, cancel, player);
    }

}