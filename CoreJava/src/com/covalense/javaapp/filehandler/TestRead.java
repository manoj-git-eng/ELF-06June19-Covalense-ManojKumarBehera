package com.covalense.javaapp.filehandler;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import lombok.extern.java.Log;

@Log
public class TestRead {
	public static void main(String[] args) {

		ObjectInputStream oin = null;
		try (FileInputStream fin = new FileInputStream("Manoj.txt")) {

			oin = new ObjectInputStream(fin);
			Person p = (Person) oin.readObject();
			log.info(p.getName());
			log.info(" " + p.getAge());
			oin.close();
		} catch (FileNotFoundException f) {
			log.severe("file not found exception");
		} catch (IOException e) {
			log.severe("IO exception");
		} catch (ClassNotFoundException c) {
			log.severe("IO exception ");
		} finally {
			if (oin != null) {
				try {
					oin.close();

				} catch (IOException i) {
					log.severe("IO exception");
				}

			}

		}

	}
}
