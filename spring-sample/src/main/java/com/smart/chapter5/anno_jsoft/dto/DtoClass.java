package com.smart.chapter5.anno_jsoft.dto;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class DtoClass {

    final static Logger logger = LoggerFactory.getLogger(DtoClass.class);

    public void say() {
        logger.info("我是DTO");
    }
}
