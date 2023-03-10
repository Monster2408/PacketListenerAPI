package xyz.mlserver.packetlistener.handler;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import xyz.mlserver.packetlistener.channel.ChannelWrapper;

public class ReceivedPacket extends PacketAbstract {
	public ReceivedPacket(Object packet, Cancellable cancellable, Player player) {
		super(packet, cancellable, player);
	}

	public ReceivedPacket(Object packet, Cancellable cancellable, ChannelWrapper channelWrapper) {
		super(packet, cancellable, channelWrapper);
	}
}
