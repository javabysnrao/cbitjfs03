package com.cbit.springcore_app1;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.FileSystemResource;

public class EmployeeMain {

	public static void main(String[] args) {

		DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
		reader.loadBeanDefinitions(new FileSystemResource("src/main/resources/beans.xml"));
		
		Employee e = beanFactory.getBean("emp", Employee.class);
		e.displayEmployee();
		
	}
}
