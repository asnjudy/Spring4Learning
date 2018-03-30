package com.smart.chapter7.advice.introduce;

import com.smart.chapter7.advice.proxy.PerformanceMonitor;
import org.aopalliance.intercept.MethodInvocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.aop.support.DelegatingIntroductionInterceptor;

public class ControllablePerformanceMonitor extends DelegatingIntroductionInterceptor implements Monitorable {

    protected final Logger logger = LoggerFactory.getLogger(getClass());

    private ThreadLocal<Boolean> monitorStatusMap = new ThreadLocal<Boolean>();

    @Override
    public void setMenitorAdvice(boolean active) {
        monitorStatusMap.set(active);
    }

    @Override
    public Object invoke(MethodInvocation mi) throws Throwable {
        Object obj = null;

        if (monitorStatusMap.get() != null && monitorStatusMap.get()) {
            PerformanceMonitor.begin(mi.getClass().getName() + "." + mi.getMethod().getName());
            obj = super.invoke(mi);
            PerformanceMonitor.end();
        } else {
            obj = super.invoke(mi);
        }
        return obj;
    }
}
