package slf4j_logback;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogbackTest {

    final static Logger logger = LoggerFactory.getLogger(LogbackTest.class);

    @Test
    public void testInfo() {
        logger.info("testInfo .....");
    }

    @Test
    public void testDebug() {
        logger.debug("testDebug .....");
    }

    @Test
    public void testError() {
        logger.error("testError .....");
    }
}
