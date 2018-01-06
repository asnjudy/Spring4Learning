package cn.asn.mybatis.first;

import cn.asn.mybatis.po.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by xuwentang on 2017/8/21.
 */
public class MybatisFirst {


    public static void findUserById() throws IOException {


        String resource = "SqlMapConfig.xml";  // 全局配置文件
        InputStream inputStream = Resources.getResourceAsStream(resource);
        // 根据配置文件创建工厂
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        // 打开一个用于操作数据库（增、删、改、查）的会话
        SqlSession sqlSession = sqlSessionFactory.openSession();

        User user = sqlSession.selectOne("test.findUserById", 1);
        System.out.println(user);
        sqlSession.close();
    }

    public static void main(String[] args) throws IOException {
        findUserById();
    }
}
