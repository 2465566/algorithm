package io.bio;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class IOServer {
    public static void main(String[] args) throws Exception {

        ServerSocket serverSocket = new ServerSocket(8000);

        ExecutorService executorService = new ThreadPoolExecutor(6, 10, 1,
                TimeUnit.SECONDS, new ArrayBlockingQueue<Runnable>(10) {
        });

        // (1) 接收新连接线程
        new Thread(() -> {
            while (true) {
                try {
                    // (1) 阻塞方法获取新的连接
                    Socket socket = serverSocket.accept();

                    // (2) 每一个新的连接都创建一个线程，负责读取数据
                    executorService.execute(new Runnable() {
                        @Override
                        public void run() {
                            try {
                                byte[] data = new byte[1024];
                                InputStream inputStream = socket.getInputStream();
                                while (true) {                //----------------------BIO  每一个线程都有一个死循环来监听数据。而NIO只有一个
                                    int len;
                                    // (3) 按字节流方式读取数据
                                    while ((len = inputStream.read(data)) != -1) {
                                        System.out.println(new String(data, 0, len));
                                    }
                                }
                            } catch (IOException e) {
                              e.printStackTrace();
                            }
                        }
                    });

                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }).start();
    }

}
