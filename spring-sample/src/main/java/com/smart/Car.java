package com.smart;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;

public class Car implements BeanFactoryAware, BeanNameAware, InitializingBean, DisposableBean {

    private String brand;
    private String color;
    private int maxSpeed;

    private BeanFactory beanFactory;
    private String beanName;

    public Car() {
        System.out.println("调用Car()构造函数");
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public String toString() {
        return String.format("[%s] brand: %s, color: %s, maxSpeed: %d",
                       super.toString(), brand, color, maxSpeed);
    }


    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("调用BeanFactoryAware接口的setBeanFactory方法");
        this.beanFactory = beanFactory;
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("调用BeanNameAware接口的setBeanName方法");
        this.beanName = name;
    }



    @Override
    public void destroy() throws Exception {
        System.out.println("调用DisposableBean接口的destroy方法");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("调用InitializingBean接口的afterPropertiesSet方法");
    }

    public void myInit() {
        System.out.println("调用init-method所指定的myInit方法，将maxSpeed设置为240");
    }

    public void myDestory() {
        System.out.println("调用destroy-method所指定的myDestory方法");
    }
}
