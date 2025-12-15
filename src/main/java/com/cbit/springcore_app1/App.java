package com.cbit.springcore_app1;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.FileSystemResource;

public class App {
    public static void main(String[] args) {
           System.out.println("App Started");
    	   DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();  
    	   XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
    	   reader.loadBeanDefinitions(new FileSystemResource("src/main/resources/beans.xml"));
    	   
    	   PrintMessage pm = beanFactory.getBean("msg",PrintMessage.class);
    	  
    	   pm.displayMessage();
    	 
    }
}
