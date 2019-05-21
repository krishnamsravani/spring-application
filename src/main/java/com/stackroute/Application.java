package com.stackroute;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * Hello world!
 *
 */

@ComponentScan(basePackages = "com.stackroute")
public class Application
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );

        ApplicationContext context=new AnnotationConfigApplicationContext(Application.class);
        Application application=context.getBean(Application.class);
        application.start();
    }

    @Autowired
    private Message message;
    private void start()
    {
        System.out.println(" Message :"+ message.getMessage());
    }
}
