package com.java.netty.readSource.demo1;

import io.netty.channel.ChannelHandlerAdapter;
import io.netty.channel.ChannelHandlerContext;
import io.netty.util.AttributeKey;

/**
 * @author gongchunru
 * @email gongchunru@gmail.com
 * Date：2018/2/7 15:14
 */
public class ClientHandler extends ChannelHandlerAdapter {

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        System.out.println("客户端开始读取数据..");


        System.out.println("接收到服务器的数据为:"+msg.toString());
        ctx.channel().attr(AttributeKey.valueOf("ChannelKey")).set(msg.toString());
        ctx.channel().close();

    }
}
