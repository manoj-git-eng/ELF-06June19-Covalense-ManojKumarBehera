package com.covalense.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.covalense.springcore.beans.MessageBean;
import com.covalense.springcore.configurations.MessageConfig;

import lombok.extern.java.Log;

@Log
public class MessageTest {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MessageConfig.class);
		((ConfigurableApplicationContext)applicationContext).registerShutdownHook();
		MessageBean messageBean = applicationContext.getBean(MessageBean.class); // Passing the id from
		MessageBean messageBean2 = applicationContext.getBean(MessageBean.class);																					// beans.xml.

		log.info(messageBean.getMessage());
		log.info(messageBean2.getMessage());
		
		messageBean2.setMessage("NOOOOOOOOOOOON");
		
		log.info(messageBean.getMessage());
		log.info(messageBean2.getMessage());
		((AbstractApplicationContext)applicationContext).close();
	} // End of main.
} // End of class.
