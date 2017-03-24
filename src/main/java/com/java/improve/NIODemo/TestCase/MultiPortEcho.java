package com.java.improve.NIODemo.TestCase;

import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by gongchunru on 2016/9/20.
 */
public class MultiPortEcho {
    private int ports[];

    private ByteBuffer echoBuffer = ByteBuffer.allocate(1024);

    public MultiPortEcho(int[] ports) {
        this.ports = ports;

    }

    private void go() throws Exception{
        //创建一个Selector
        Selector selector = Selector.open();

        //open a listner on each port ,and register each one with the selector

        for (int i = 0; i < ports.length; ++i) {
            ServerSocketChannel ssc = ServerSocketChannel.open();//打开服务器套接字通道。
            ssc.configureBlocking(false);//调整此通道的阻塞模式。 false 处于非阻塞模式
            ServerSocket ss = ssc.socket();
            InetSocketAddress address = new InetSocketAddress(ports[i]);
            ss.bind(address);

            SelectionKey key = ssc.register(selector,SelectionKey.OP_ACCEPT);
            System.out.println("Going to listen on "+ports[i]);
        }

        while (true){
            int num = selector.select();

            Set selectedKeys = selector.selectedKeys();
            Iterator it = selectedKeys.iterator();

            while (it.hasNext()){
                SelectionKey key = (SelectionKey) it.next();

                if ((key.readyOps() & SelectionKey.OP_ACCEPT) == SelectionKey.OP_ACCEPT){
                    ServerSocketChannel ssc = (ServerSocketChannel)key.channel();

                    SocketChannel sc = ssc.accept();
                    sc.configureBlocking(false);

                    //add the new connection to the selector
                    SelectionKey newKey = sc.register(selector,SelectionKey.OP_READ);
                    it.remove();

                    System.out.println("Got connection from"+sc);
                }else if ((key.readyOps()&SelectionKey.OP_READ) == SelectionKey.OP_READ){
                    SocketChannel sc = (SocketChannel)key.channel();
                    //Echo data
                    int bytesEchoed = 0;
                    while (true){
                        echoBuffer.clear();
                        int r = sc.read(echoBuffer);

                        if (r<=0){
                            break;
                        }
                        echoBuffer.flip();

                        sc.write(echoBuffer);
                        bytesEchoed += r;
                    }
                    System.out.println("Echoed "+bytesEchoed+"from"+sc);
                    it.remove();
                }
            }
        }
    }

}
