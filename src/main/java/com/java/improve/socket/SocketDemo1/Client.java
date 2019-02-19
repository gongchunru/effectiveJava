package com.java.improve.socket.SocketDemo1;

import java.io.*;
import java.net.*;

/**
 * @author gongchunru
 * @create 2018-11-05 8:23 PM
 */
public class Client {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket();

        //超时时间
        socket.setSoTimeout(3000);

        // 连接端口
        socket.connect(new InetSocketAddress(InetAddress.getLocalHost(), 2000), 3000);

        System.out.println("已经发起服务器连接，并进入后续流畅~");
        System.out.println("客户端信息：" + socket.getLocalAddress() + " p:" + socket.getLocalPort());
        System.out.println("服务器信息：" + socket.getInetAddress() + " p:" + socket.getPort());

        try {
            // 发送数据
            todo(socket);
        } catch (Exception e) {
            System.out.println("异常关闭");
        }

        socket.close();
        System.out.println("客户端已经退出...");

    }


    private static void todo(Socket client) throws Exception {
        // 构建键盘输入流
        InputStream in = System.in;
        BufferedReader input = new BufferedReader(new InputStreamReader(in));

        // 得到socket输出流，并转换为打印流
        OutputStream outputStream = client.getOutputStream();
        PrintStream socketPrintStream = new PrintStream(outputStream);

        // 得到socket输入流，并转换为
        InputStream inputStream = client.getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

        boolean flag = true;
        do {
            // 键盘读取一行
            String str = input.readLine();

            // 发送到服务器
            socketPrintStream.println(str);

            //从服务器读取一行
            String echo = bufferedReader.readLine();
            if ("bye".equalsIgnoreCase(echo)) {
                flag = true;
            } else {
                System.out.println(echo);
            }
        } while (flag);
        socketPrintStream.close();
        bufferedReader.close();
    }
}
