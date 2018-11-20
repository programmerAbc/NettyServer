package com.practice;

import com.practice.protocol.EchoServer;

public class App {
    public static void main(String[] args) {
        EchoServer echoServer = new EchoServer();
        echoServer.startServer(Integer.parseInt(args[0]));
    }
}
