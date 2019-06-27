package com.covalense.javaapp.properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import lombok.extern.java.Log;
@Log
public class TestReadProperties {
public static void main(String[] args) {
	try {
		FileInputStream fin=new FileInputStream("demo.properties");
		
		Properties p=new Properties();
		p.load(fin);
		
		
		String phone=(String) p.get("Phone number");
		log.info(phone);
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
	
}
}
