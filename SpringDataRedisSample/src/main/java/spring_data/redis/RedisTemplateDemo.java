package spring_data.redis;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import spring_data.redis.service.ServiceExample;

import java.net.MalformedURLException;
import java.net.URL;

public class RedisTemplateDemo {


    public static void testRedis() throws MalformedURLException {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");

        RedisTemplate redisTemplate = ctx.getBean("redisTemplate", RedisTemplate.class);

        StringRedisTemplate stringRedisTemplate = ctx.getBean("stringRedisTemplate", StringRedisTemplate.class);

        // System.out.println(redisTemplate.delete("u001"));
        redisTemplate.opsForValue().set("foo".getBytes(), "f123".getBytes());

        stringRedisTemplate.opsForValue().set("boo", "b222");
    }


    public static void main(String[] args) throws MalformedURLException {

        testRedis();

    }
}
