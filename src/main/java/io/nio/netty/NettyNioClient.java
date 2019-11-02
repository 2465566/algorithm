package io.nio.netty;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.codec.string.StringEncoder;
import java.util.Date;

public class NettyNioClient {
  public static void main(String[] args) throws InterruptedException {
    Bootstrap bootstrap = new Bootstrap();
    NioEventLoopGroup group = new NioEventLoopGroup();

    bootstrap.group(group)
        .channel(NioSocketChannel.class)
        .handler(new ChannelInitializer<Channel>() {
          @Override
          protected void initChannel(Channel ch) {
            ch.pipeline().addLast(new StringEncoder());
          }
        });

    Channel channel = bootstrap.connect("127.0.0.1", 8001).channel();

    while (true) {
        String message = new Date() + ": hello world7777777!";
        channel.writeAndFlush("client send: " + message);
        System.out.println(message);

        Thread.sleep(2000);
    }
  }
}
