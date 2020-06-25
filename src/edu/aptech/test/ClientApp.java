package edu.aptech.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import edu.aptech.bean.Test;

public class ClientApp 
{
	public static void main(String[] args) 
	{
		Resource resource=new ClassPathResource("edu/aptech/cfgs/spring.xml");
		BeanFactory factory=new XmlBeanFactory(resource);
		Test test=(Test)factory.getBean("t");
		test.syaHello();
		Test test1=(Test)factory.getBean("t");
		test1.syaHello();
		Test test2=(Test)factory.getBean("t");
		test2.syaHello();
		
		//Using Advanced Container
		/*ApplicationContext ctx=new ClassPathXmlApplicationContext("edu/aptech/cfgs/spring.xml");
		Test t11=(Test)ctx.getBean("t");
		t11.syaHello();
		Test t12=(Test)ctx.getBean("t");
		t12.syaHello();
		Test t13=(Test)ctx.getBean("t");
		t13.syaHello();*/
	}
}
