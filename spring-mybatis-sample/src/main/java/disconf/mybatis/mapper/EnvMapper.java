package disconf.mybatis.mapper;

import disconf.mybatis.entity.Env;
import org.mybatis.spring.annotation.MapperScan;

@MapperScan
public interface EnvMapper {
    int deleteByPrimaryKey(Long envId);

    int insert(Env record);

    int insertSelective(Env record);

    Env selectByPrimaryKey(Long envId);

    int updateByPrimaryKeySelective(Env record);

    int updateByPrimaryKey(Env record);
}