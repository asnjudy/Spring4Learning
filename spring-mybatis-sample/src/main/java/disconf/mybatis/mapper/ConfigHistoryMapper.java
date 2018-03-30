package disconf.mybatis.mapper;

import disconf.mybatis.entity.ConfigHistory;
import org.mybatis.spring.annotation.MapperScan;

@MapperScan
public interface ConfigHistoryMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ConfigHistory record);

    int insertSelective(ConfigHistory record);

    ConfigHistory selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ConfigHistory record);

    int updateByPrimaryKey(ConfigHistory record);
}