package com.covalense.javaapp.assignmentsseven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import lombok.extern.java.Log;

/*
 * WAP to read data from the csv
 */
@Log
public class Pro5 {

	public static void main(String[] args) {

		File f1 = new File("srcfile.csv");

		try (InputStream in = new FileInputStream(f1);) {
			int i;
			while ((i = in.read()) != -1) {
				log.info("" + (char) i);
			}
			if (in != null)
				in.close();

		} catch (FileNotFoundException e) {
			log.info("file not found");
		} catch (IOException e) {
			log.info("IO exception");
		}

	}

}
