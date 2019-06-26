package com.covalense.javaapp.assignmentsseven;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Logger;

public class ReadWriteToFile {

	private static final Logger log = Logger.getLogger("manu");

	public static void main(String[] args) {
		String msg = "ding ding diganna";
		char[] ch = msg.toCharArray();
		try (FileWriter fout = new FileWriter("srcfile.csv", true)) {
			fout.write(ch);
			fout.flush();
			log.info("data is write into file");
		} catch (FileNotFoundException e) {
			log.info("file not found");
		} catch (IOException e) {
			log.info("IO exception");
		}
	}

}
