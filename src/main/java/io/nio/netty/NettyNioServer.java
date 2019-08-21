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

        /**
         * NioSocketChannel，异步的客户端 TCP Socket 连接。
         * NioServerSocketChannel，异步的服务器端 TCP Socket 连接。
         * NioDatagramChannel，异步的 UDP 连接。
         * NioSctpChannel，异步的客户端 Sctp 连接。
         * NioSctpServerChannel，异步的 Sctp 服务器端连接，这些通道涵盖了 UDP 和 TCP 网络 IO 以及文件 IO。
         */
        .channel(NioServerSocketChannel.class)   // 设置channel类型为NIO类型, 此处支持BIO/NIO

        /**
         * ChannelHandler 是一个接口，处理 I/O 事件或拦截 I/O 操作，并将其转发到其 ChannelPipeline(业务处理链)中的下一个处理程序。
         *
         * ChannelHandler 本身并没有提供很多方法，因为这个接口有许多的方法需要实现，方便使用期间，可以继承它的子类：
         *
         * ChannelInboundHandler 用于处理入站 I/O 事件。
         * ChannelOutboundHandler 用于处理出站 I/O 操作。
         * 或者使用以下适配器类：
         *
         * ChannelInboundHandlerAdapter 用于处理入站 I/O 事件。
         * ChannelOutboundHandlerAdapter 用于处理出站 I/O 操作。
         * ChannelDuplexHandler 用于处理入站和出站事件。
         */
        .childHandler(new ChannelInitializer<NioSocketChannel>() {    // 配置入站、出站事件handler
          protected void initChannel(NioSocketChannel channel) {
            // 配置入站、出站事件channel

            /**
             * ChannelPipeline 保存 ChannelHandler 的 List，用于处理或拦截 Channel 的入站事件和出站操作。
             * ChannelPipeline 实现了一种高级形式的拦截过滤器模式，使用户可以完全控制事件的处理方式
             * ，以及 Channel 中各个的 ChannelHandler 如何相互交互。
             */
            channel.pipeline().addLast(new StringDecoder());
            channel.pipeline().addLast(new SimpleChannelInboundHandler<String>() {   // addLast 就是让流水线中加入一个处理工序, 此处打印数据
              @Override
              protected void channelRead0(ChannelHandlerContext ctx, String msg) {
                /**
                 * ChannelHandlerContext
                 * 保存 Channel 相关的所有上下文信息，同时关联一个 ChannelHandler 对象。
                 */
                System.out.println(msg);
              }
            });
          }
        })
        .bind(port)
        /**
         *异步操作
         * .isDone()
         * .isSuccess()
         * .isCancelled()
         * .addListener()
         */
        .addListener(future -> {   //addListener 为 bind(port) 添加监听，当bind成功后返回 future
          if (future.isSuccess()) {
            System.out.println(new Date() + ": 端口[" + port + "]绑定成功!");
          } else {
            System.err.println("端口[" + port + "]绑定失败!");
          }
        });
  }
}
