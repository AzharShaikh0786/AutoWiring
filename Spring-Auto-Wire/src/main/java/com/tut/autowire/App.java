package com.tut.autowire;

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

    	ApplicationContext context =  new ClassPathXmlApplicationContext("SpringCfg.xml");
    	Employee emp = context.getBean("emp1",Employee.class);
    	System.out.print(emp);
    }
}
