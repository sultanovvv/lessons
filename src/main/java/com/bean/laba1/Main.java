package com.bean.laba1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by 111 on 12.09.2016.
 */
public class Main {
    public static void main(String []args){

        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext(new String[] {"config.xml"});
        BeanA A = (BeanA) ac.getBean("A");
        A.sayHi();
        System.out.println(A.getName());
        BeanB B = A.getB();
        B.sayHi();
        System.out.println(B.getName());
    }
}