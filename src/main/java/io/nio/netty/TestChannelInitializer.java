package io.nio.netty;

import io.netty.channel.Channel;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.handler.codec.string.StringDecoder;

public class TestChannelInitializer extends ChannelInitializer {

  @Override
  protected void initChannel(Channel channel) throws Exception {
    // 配置入站、出站事件channel
    /**
     * ChannelPipeline 保存 ChannelHandler 的 List，用于处理或拦截 Channel 的入站事件和出站操作。
     * ChannelPipeline 实现了一种高级形式的拦截过滤器模式，使用户可以完全控制事件的处理方式
     * ，以及 Channel 中各个的 ChannelHandler 如何相互交互。
     */
    channel.pipeline().addLast(new StringDecoder());                         // ChannelPipeline addLast(ChannelHandler... var1);
    channel.pipeline().addLast(new SimpleChannelInboundHandler<String>() {   // addLast 就是让流水线中加入一个ChannelHandler 处理工序, 此处打印数据
      @Override
      protected void channelRead0(ChannelHandlerContext ctx, String msg) {
        /**
         * ChannelHandlerContext
         * 保存 Channel 相关的所有上下文信息，同时关联一个 ChannelHandler 对象。
         */
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getId());
        System.out.println(msg);
      }
    });
  }
}
