package edu.lsp.webServer.bootstrap;

import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.DelimiterBasedFrameDecoder;
import io.netty.handler.codec.Delimiters;
import io.netty.handler.codec.string.StringDecoder;
import io.netty.handler.codec.string.StringEncoder;

public class TelnetServerInitializer extends ChannelInitializer<SocketChannel> {

	private static final StringDecoder DECODER = new StringDecoder();
	private static final StringEncoder ENCODER = new StringEncoder();

	private static final TelnetServerHandler SERVER_HANDLER = new TelnetServerHandler();


	public TelnetServerInitializer() {
	}

	@Override
	public void initChannel(SocketChannel ch) throws Exception {
		ChannelPipeline pipeline = ch.pipeline();

		// Add the text line codec combination first,
		pipeline.addLast(new DelimiterBasedFrameDecoder(8192, Delimiters.lineDelimiter()));
		// the encoder and decoder are static as these are sharable
		pipeline.addLast(DECODER);
		pipeline.addLast(ENCODER);

		// and then business logic.
		pipeline.addLast(SERVER_HANDLER);
	}
}