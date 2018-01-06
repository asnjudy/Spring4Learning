package cn.asn.mybatis;

import cn.asn.mybatis.mapper.UserMapper;
import cn.asn.mybatis.po.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

/**
 * Created by xuwentang on 2017/8/21.
 */
public class App {

    public static void testFindUserById() throws Exception {

        String resource = "SqlMapConfig.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);

        // 创建会话工厂，传入mybatis的配置文件信息
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        // 打开一个用于操作数据库（增、删、改、查）的会话
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = userMapper.findUserById(3);
        System.out.println(user);

        user.setUsername("测试用户22");
        userMapper.updateUser(user);
        //执行commit操作去清空缓存
        sqlSession.commit();

        User user2 = userMapper.findUserById(3);
        System.out.println(user2);

        sqlSession.close();
    }


    public static void main(String[] args) throws Exception {
        testFindUserById();
    }
}
