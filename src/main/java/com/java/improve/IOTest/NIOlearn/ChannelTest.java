package com.java.improve.IOTest.NIOlearn;

import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;

/**
 * @author gongchunru
 * @email gongchunru@gmail.com
 * Date：2018/2/6 17:13
 */
public class ChannelTest {


    public static void main(String[] args) throws Exception{

        Charset charset = Charset.forName("utf-8");
        CharsetDecoder decoder = charset.newDecoder();

        RandomAccessFile accessFile = new RandomAccessFile("C:\\work\\code\\rfc.txt","rw");
        // fileChannel不能设置成非阻塞模式
        FileChannel inChannel =accessFile.getChannel();

        ByteBuffer buffer = ByteBuffer.allocate(48);
        CharBuffer charBuffer = CharBuffer.allocate(48);

        int bytesRead = inChannel.read(buffer);

        while (bytesRead != -1){
            buffer.flip();
            decoder.decode(buffer,charBuffer,false);
            //将buffer切换为读模式
            charBuffer.flip();
            while (charBuffer.hasRemaining()){
                System.out.print(charBuffer.get());
            }

//            清理 Buffer, 让其从新可写
            buffer.clear();
            charBuffer.clear();

            bytesRead = inChannel.read(buffer);
        }


    accessFile.close();

    }


}
