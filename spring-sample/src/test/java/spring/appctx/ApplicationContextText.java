package spring.appctx;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationContextText {

    final static Logger LOG = LoggerFactory.getLogger(ApplicationContextText.class);

    @Test
    public void testClassPathXmlApplicationContext() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        LOG.info("ctx: " + applicationContext);
    }

}
