package jedis;

import redis.clients.jedis.BinaryJedis;

public class JedisDemo {


    public static void main(String[] args) {

        BinaryJedis bjedis = new BinaryJedis("localhost", 6379, 0);
        String ret0 = bjedis.set("name".getBytes(), "xinxin".getBytes());
        System.out.println(ret0);

        Long ret2 = bjedis.append("name".getBytes(), " is my lover".getBytes());
        System.out.println(ret2);
    }
}
