package com.smart.chapter7.advice.proxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PerformanceMonitor {

    protected static final Logger logger = LoggerFactory.getLogger(PerformanceMonitor.class);

    /**
     * 通过一个 ThreadLocal 保存与调用线程相关的性能监视信息
     */
    private static ThreadLocal<MethodPerformance> performanceThreadLocal =
            new ThreadLocal<MethodPerformance>();

    /**
     *  启动对一个目标方法的性能监视
     * @param method
     */
    public static void begin(String method) {
        logger.info("begin monitor ...");
        MethodPerformance methodPerformance = new MethodPerformance(method);
        performanceThreadLocal.set(methodPerformance);
    }


    /**
     * 结束对某个目标类方法的监视，并给出性能监视信息
     */
    public static void end() {
        logger.info("end monitor ...");
        MethodPerformance methodPerformance = performanceThreadLocal.get();
        methodPerformance.printPerformance(); // 打印出方法性能监视的结果信息
    }
}
