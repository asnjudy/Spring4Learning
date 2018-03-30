package spring_data.redis.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.net.URL;

@Component
public class ServiceExample {

    // 注入RedisTemplate实例
    @Autowired
    private RedisTemplate<String, String> template;

    // 注入RedisTemplate实例作为ListOperations
    @Resource(name = "redisTemplate")
    private ListOperations<String, String> listOps;

    public void addLink(String userId, URL url) {
        System.out.println(listOps.leftPush(userId, url.toExternalForm()));
    }
}
