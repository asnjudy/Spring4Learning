package com.smart.beanfactory;

import com.smart.chapter3.Car;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor {


    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if ("car".equals(beanName)) {
            Car car = (Car) bean;
            if ("red".equals(car.getColor())) {
                System.out.println("调用BeanPostProcessor接口的postProcessBeforeInitialization方法设置为黑色");
                car.setColor("black");
            }
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if ("car".equals(beanName)) {
            Car car = (Car) bean;
            if (car.getMaxSpeed() >= 200) {
                System.out.println("调用BeanPostProcessor接口的postProcessBeforeInitialization方法设置速度最大不超过200");
                car.setMaxSpeed(200);
            }
        }
        return bean;
    }
}
