package com.mti.tp3;

import com.mti.helloWorld.HelloWorld;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
	ClassPathResource res = new ClassPathResource("applicationContext.xml");
	XmlBeanFactory factory = new XmlBeanFactory(res);

	HelloWorld hello = (HelloWorld) factory.getBean("hello");    
	hello.hello();
    }
}
