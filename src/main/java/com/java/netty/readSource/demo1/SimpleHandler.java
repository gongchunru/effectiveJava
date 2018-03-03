package com.java.netty.readSource.demo1;

import io.netty.channel.ChannelHandlerAdapter;
import io.netty.channel.ChannelHandlerContext;

import java.nio.ByteBuffer;

/**
 * @author gongchunru
 * @email gongchunru@gmail.com
 * Date：2018/2/7 15:09
 */
public class SimpleHandler extends ChannelHandlerAdapter{

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        super.channelRead(ctx, msg);

        System.out.println("开始读取数据==========="+msg);

        if (msg instanceof ByteBuffer){
            ByteBuffer buffer = (ByteBuffer)msg;
            String content = buffer.toString();
            System.out.println(content);
            ctx.channel().writeAndFlush("李四\r\n");
        }
    }


    @Override
    public void userEventTriggered(ChannelHandlerContext ctx, Object evt) throws Exception {
        super.userEventTriggered(ctx, evt);
    }
}
