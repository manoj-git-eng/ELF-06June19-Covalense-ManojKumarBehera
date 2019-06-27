package com.covalense.javaapp.properties;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import lombok.extern.java.Log;
@Log
public class TestWritetoProperties {
	public static void main(String[] args) {
		try {
			FileOutputStream fout = new FileOutputStream("demo.properties");
			
			Properties p=new Properties();
			p.setProperty("Company name", "covalense");
			p.setProperty("Phone number", "7381717433");
			
			p.store(fout, "Company details");
			log.info("created");
			
			
		} catch (FileNotFoundException e) {
			log.info("file notn found");
		} catch (IOException e) {
			log.info("io exception");
		}

	}
}
