package disconf.mybatis.mapper;

import disconf.mybatis.entity.User;
import org.mybatis.spring.annotation.MapperScan;

@MapperScan
public interface UserMapper {
    int deleteByPrimaryKey(Long userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Long userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}