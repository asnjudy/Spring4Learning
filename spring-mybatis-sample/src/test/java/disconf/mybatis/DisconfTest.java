package disconf.mybatis;

import disconf.mybatis.entity.App;
import disconf.mybatis.service.AppService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DisconfTest {

    ApplicationContext ctx;

    @Before
    public void init() {
        String[] contextConfigLocations = {
                "applicationContext.xml"
        };
        ctx = new ClassPathXmlApplicationContext(contextConfigLocations);
    }

    @Test
    public void testGetApp() {
        AppService appService = ctx.getBean(AppService.class);
        App app = new App();
        app.setName("demo3");
        app.setDescription("demo345");
        app.setEmails("demo@tt.com");
        app.setCreateTime("11222222");
        app.setUpdateTime("34445566");

        System.out.println(app);
        appService.insert(app);
        System.out.println(app);
    }
}
