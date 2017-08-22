package cn.asn.mybatis.mapper;

import cn.asn.mybatis.po.User;
import cn.asn.mybatis.po.UserCustom;
import cn.asn.mybatis.po.UserQueryVo;

import java.util.List;

/**
 * Created by xuwentang on 2017/8/21.
 */
public interface UserMapper {

    // 根据id查询用户信息
    public User findUserById(int id) throws Exception;
    // 根据用户查询用户列表
    public List<User> findUserByName(String name) throws Exception;
    // 添加用户信息
    public void insertUser(User user) throws Exception;
    // 删除用户信息
    public void deleteUser(int id) throws Exception;
    // 更新用户信息
    public void updateUser(User user) throws Exception;
    // 用户信息综合查询
    public List<UserCustom> findUserList(UserQueryVo userQueryVo) throws Exception;
    // 用户信息综合查询总数
    public int findUserCount(UserQueryVo userQueryVo) throws Exception;
    // 根据id查询用户信息，使用resultMap输出
    public User findUserByIdResultMap(int id) throws Exception;
}
