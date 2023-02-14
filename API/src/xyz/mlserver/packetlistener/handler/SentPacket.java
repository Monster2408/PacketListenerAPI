package xyz.mlserver.packetlistener.handler;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import xyz.mlserver.packetlistener.channel.ChannelWrapper;

public class SentPacket extends PacketAbstract {
	public SentPacket(Object packet, Cancellable cancellable, Player player) {
		super(packet, cancellable, player);
	}

	public SentPacket(Object packet, Cancellable cancellable, ChannelWrapper channelWrapper) {
		super(packet, cancellable, channelWrapper);
	}
}
