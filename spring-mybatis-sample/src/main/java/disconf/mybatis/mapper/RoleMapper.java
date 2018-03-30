package disconf.mybatis.mapper;

import disconf.mybatis.entity.Role;
import org.mybatis.spring.annotation.MapperScan;

@MapperScan
public interface RoleMapper {
    int deleteByPrimaryKey(Long roleId);

    int insert(Role record);

    int insertSelective(Role record);

    Role selectByPrimaryKey(Long roleId);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);
}