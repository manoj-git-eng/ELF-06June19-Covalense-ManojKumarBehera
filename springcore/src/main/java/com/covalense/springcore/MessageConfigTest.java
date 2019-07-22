package com.covalense.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.covalense.springcore.beans.MessageBean;
import com.covalense.springcore.configurations.MessageConfig;

import lombok.extern.java.Log;

@Log
public class MessageConfigTest {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(MessageConfig.class);

		MessageBean messageBean = context.getBean(MessageBean.class);
		log.info(messageBean.getMessage());

	}
}
