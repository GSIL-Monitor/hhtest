package com.ppd.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ppd.test.apollo.Calc;

public class AppMain {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("/spring.xml");
        ctx.start();
        Calc c = ctx.getBean(Calc.class);
        c.calc();
        System.in.read();
    }
}
