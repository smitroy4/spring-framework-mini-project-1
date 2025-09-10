package com.smit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
        Developer dev = (Developer) context.getBean("developer");
        dev.Method();
    }
}
