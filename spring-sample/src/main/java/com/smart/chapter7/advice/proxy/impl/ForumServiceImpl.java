package com.smart.chapter7.advice.proxy.impl;

import com.smart.chapter7.advice.proxy.ForumService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ForumServiceImpl implements ForumService {

    protected final Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    public void removeTopic(int topicId) {
        logger.info("remove topic: " + topicId);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void removeForum(int forumId) {
        logger.info("remove forum: " + forumId);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
