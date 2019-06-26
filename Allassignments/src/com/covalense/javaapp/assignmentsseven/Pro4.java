package com.covalense.javaapp.assignmentsseven;

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

		ObjectOutputStream obj = null;
		try (FileOutputStream fout = new FileOutputStream("person.csv")) {
			Emp e = new Emp();
			e.set("manu", 20, "IT", 20000);
			obj = new ObjectOutputStream(fout);
			obj.writeObject(e);
			log.info("done");
		} catch (FileNotFoundException e) {
			log.info("file not found");
		} catch (IOException e) {
			log.info("IO exception");
		} finally {

			try {
				if (obj != null)
					obj.close();
			} catch (IOException e) {
				log.info("IO exception");
			}
		}

	}

}
