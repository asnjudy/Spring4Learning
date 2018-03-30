package disconf.mybatis.service;

import disconf.mybatis.entity.App;
import disconf.mybatis.mapper.AppMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class AppService {

    final static Logger logger = LoggerFactory.getLogger(AppService.class);

    @Resource
    private AppMapper appMapper;

    public App getApp(Long appId) {
        return appMapper.selectByPrimaryKey(appId);
    }

    public void insert(App app) {
        int affectedNums = appMapper.insert(app);
        if (affectedNums == 1) {
            logger.info("insert app to db successfully!");
        } else {
            logger.error("insert app to db failed! ");
        }
    }
}
