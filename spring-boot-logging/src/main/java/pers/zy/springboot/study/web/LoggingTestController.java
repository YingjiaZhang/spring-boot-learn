package pers.zy.springboot.study.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoggingTestController {

    Logger logger = LoggerFactory.getLogger(LoggingTestController.class);

    @RequestMapping("/test")
    public String index() {
        logger.trace("A test TRACE Message");
        logger.debug("A test DEBUG Message");
        logger.info("An test INFO Message");
        logger.warn("A test WARN Message");
        logger.error("An test ERROR Message");

        return "Test Howdy! Check out the Logs to see the output...";
    }
}