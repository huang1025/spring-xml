package com.huang.springxml;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * Test - test
 *
 * @author: huang_jiangling
 * @date: 2019-09-02
 **/
@Component
public class Test {

    @PostConstruct
    public void hehe() {
        System.out.println("===========");
        System.out.println("===========");
        System.out.println("===========");
        System.out.println("===========");
        System.out.println("===========");
        System.out.println("hehe");
        System.out.println("===========");
        System.out.println("===========");
        System.out.println("===========");
        System.out.println("===========");
        System.out.println("===========");
    }
}
