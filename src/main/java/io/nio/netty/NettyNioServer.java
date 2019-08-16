package io.nio.netty;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.codec.string.StringDecoder;
import java.util.Calendar;
import java.util.Date;
import javafx.beans.Observable;
import javax.xml.crypto.Data;

public class NettyNioServer {
  public static void main(String[] args) {
    int port = 8001;
    ServerBootstrap serverBootstrap = new ServerBootstrap();

    /**
     * boos 线程池则只是在 Bind 某个端口后，获得其中一个线程作为 MainReactor，
     * 专门处理端口的 Accept 事件，每个端口对应一个 Boss 线程。
     */
    NioEventLoopGroup boos = new NioEventLoopGroup();

    /**
     * workerGroup 线程池会被各个 SubReactor 和 Worker 线程充分利用。
     */
    NioEventLoopGroup workerGroup = new NioEventLoopGroup();
    serverBootstrap
        .group(boos, workerGroup)
        .channel(NioServerSocketChannel.class)   // 设置channel类型为NIO类型, 此处支持BIO/NIO
        .childHandler(new ChannelInitializer<NioSocketChannel>() {    // 配置入站、出站事件handler
          protected void initChannel(NioSocketChannel ch) {
            // 配置入站、出站事件channel
            ch.pipeline().addLast(new StringDecoder());
            ch.pipeline().addLast(new SimpleChannelInboundHandler<String>() {
              @Override
              protected void channelRead0(ChannelHandlerContext ctx, String msg) {
                System.out.println(msg);
              }
            });
          }
        })
        .bind(port)
        //异步操作
//        .isDone()
//        .isSuccess()
//        .isCancelled()
//        .addListener()
        .addListener(future -> {   //addListener 为 bind(port) 添加监听，当bind成功后返回 future
          if (future.isSuccess()) {
            System.out.println(new Date() + ": 端口[" + port + "]绑定成功!");
          } else {
            System.err.println("端口[" + port + "]绑定失败!");
          }
        });
  }
}
