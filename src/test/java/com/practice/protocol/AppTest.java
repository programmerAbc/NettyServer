package com.practice.protocol;

import com.alibaba.fastjson.JSON;
import com.practice.protocol.model.Message;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class AppTest {
    @Test
    public void runServer() {
        EchoServer echoServer = new EchoServer();
        echoServer.startServer(8080);
        System.out.println("server start");
    }

    @Test
    public void runJson() {
        Map<String, Long> map = new HashMap<>();
        map.put("time", System.currentTimeMillis());
        String json = JSON.toJSONString(Message.newBuilder()
                .type(Message.MSG_TYPE_SYNC_HOSTER_TIME)
                .data(JSON.toJSONString(map))
                .build());
        System.out.println(json);

    }
}
