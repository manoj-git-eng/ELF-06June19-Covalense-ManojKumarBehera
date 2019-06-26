package com.covalense.javaapp.assignmentsseven;

import java.io.File;

/*wap to store 5 student into file and read only the student who got more than 80%
wap to append the content of file1 to content of file2*/

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

import lombok.extern.java.Log;

@Log

public class FileHandling1 {

	public static void main(String[] args) {
		File file = new File("manoj.txt");
		try (FileWriter ofile = new FileWriter(file)) {

		} catch (FileNotFoundException e) {
			log.info("File not found");
		} catch (IOException e) {
			log.info("IO exception");
		}

	}
}
