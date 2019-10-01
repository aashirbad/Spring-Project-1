package com.aashirbad.Test1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext app = new ClassPathXmlApplicationContext("spring.xml");
        Motors obj = (Motors) app.getBean("motor");
        obj.drive();
    }
}
