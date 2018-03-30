package disconf.mybatis.mapper;

import disconf.mybatis.entity.Config;
import org.mybatis.spring.annotation.MapperScan;

@MapperScan
public interface ConfigMapper {
    int deleteByPrimaryKey(Long configId);

    int insert(Config record);

    int insertSelective(Config record);

    Config selectByPrimaryKey(Long configId);

    int updateByPrimaryKeySelective(Config record);

    int updateByPrimaryKey(Config record);
}