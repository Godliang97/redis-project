package com.bjpowernode.jedis;

import redis.clients.jedis.Jedis;

public class JedisKeyTest {
    public static void main(String[] args) {
        //连接redis
        Jedis jedis = new Jedis("192.168.1.3",6379);
        //使用redis对象操作redis服务
        String ret = jedis.ping();
        System.out.println(ret);
    }
}
