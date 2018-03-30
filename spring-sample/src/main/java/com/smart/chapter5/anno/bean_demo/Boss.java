package com.smart.chapter5.anno.bean_demo;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

@Component
public class Boss {

    private Car car;

    public Boss(){
        System.out.println("construct Boss");
    }

    @Resource
    private void setCar(Car car){
        System.out.println("execute in setCar");
        this.car = car;
    }

    @PostConstruct
    private void init1(){
        System.out.println("execute in init1");
    }

    @PostConstruct
    private void init2(){
        System.out.println("execute in init1");
    }

    @PreDestroy
    private void destory1(){
        System.out.println("execute in destory1");
    }

    @PreDestroy
    private void destory2(){
        System.out.println("execute in destory2");
    }


}
