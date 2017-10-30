package com.ppd.test.apollo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("/spring.xml");
        ctx.start();
        TestApolloAnnotationBean c = ctx.getBean(TestApolloAnnotationBean.class);
        c.calc();
        System.in.read();
    }
}
