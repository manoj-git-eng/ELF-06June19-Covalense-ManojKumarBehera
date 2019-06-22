package com.covalense.javaapp.filehandler;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import lombok.extern.java.Log;

import java.io.IOException;

@Log
public class TestPerson {
	public static void main(String[] args) {
		Person p = new Person();
		p.setName("Manoj");
		p.setAge(23);
		FileOutputStream fout = null;
		try {
			fout = new FileOutputStream("MANOJ.txt");
			ObjectOutputStream obj = new ObjectOutputStream(fout);
			obj.writeObject(p);
			log.info("written ");
			
			obj.close();
		} catch (FileNotFoundException e) {
			log.severe("File not found exception");
		} catch (IOException i) {
			log.severe("IO exception");
		} finally {
			try {
				fout.close();
			} catch (IOException e) {
				log.severe("IO exception");
			}
		}
	}

}
