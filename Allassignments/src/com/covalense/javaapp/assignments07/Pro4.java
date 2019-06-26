package com.covalense.javaapp.assignments07;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import lombok.extern.java.Log;

/*
 * wap to write the data in CSV file (name,age,designation,salary)
 */
@Log
public class Pro4 {

	public static void main(String[] args) {

		FileOutputStream fout = null;
		ObjectOutputStream obj = null;
		try {
			Emp e = new Emp();
			e.set("bhavani", 20, "IT", 20000);
			fout = new FileOutputStream("person.csv");
			obj = new ObjectOutputStream(fout);
			obj.writeObject(e);
			log.info("done");
		} catch (FileNotFoundException e) {
			log.info("file not found");
		} catch (IOException e) {
			log.info("IO exception");
		} finally {

			try {
				if (fout != null)
					fout.close();
				if (obj != null)
					obj.close();
			} catch (IOException e) {
				log.info("IO exception");
			}
		}

	}

}
