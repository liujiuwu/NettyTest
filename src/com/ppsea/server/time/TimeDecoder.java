package com.ppsea.server.time;

import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.channel.Channel;
import org.jboss.netty.channel.ChannelHandlerContext;
import org.jboss.netty.handler.codec.replay.ReplayingDecoder;
import org.jboss.netty.handler.codec.replay.VoidEnum;

public class TimeDecoder extends ReplayingDecoder<VoidEnum> {

	@Override
	protected Object decode(ChannelHandlerContext ctx, Channel channel, ChannelBuffer buffer, VoidEnum state) throws Exception {
		return buffer.readBytes(4);
	}

}
