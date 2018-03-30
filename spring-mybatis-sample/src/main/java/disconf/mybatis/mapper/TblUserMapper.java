package disconf.mybatis.mapper;

import disconf.mybatis.entity.TblUser;
import org.mybatis.spring.annotation.MapperScan;

@MapperScan
public interface TblUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TblUser record);

    int insertSelective(TblUser record);

    TblUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TblUser record);

    int updateByPrimaryKey(TblUser record);
}