package com.covalense.springcore.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.covalense.springcore.beans.MessageBean;

import lombok.extern.java.Log;

@Configuration
public class MessageConfig {
	@Bean
	public MessageBean getMessageBean() {
		MessageBean messageBean = new MessageBean();
		messageBean.setMessage("Annotated example..........");
		return  messageBean;
	}

}
