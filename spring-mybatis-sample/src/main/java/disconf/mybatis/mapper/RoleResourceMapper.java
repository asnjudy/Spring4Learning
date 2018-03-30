package disconf.mybatis.mapper;

import disconf.mybatis.entity.RoleResource;
import org.mybatis.spring.annotation.MapperScan;

@MapperScan
public interface RoleResourceMapper {
    int deleteByPrimaryKey(Long roleResId);

    int insert(RoleResource record);

    int insertSelective(RoleResource record);

    RoleResource selectByPrimaryKey(Long roleResId);

    int updateByPrimaryKeySelective(RoleResource record);

    int updateByPrimaryKey(RoleResource record);
}