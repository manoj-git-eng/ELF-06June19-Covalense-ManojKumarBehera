package com.covalense.javaapp.filehandler;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

import lombok.extern.java.Log;
@Log
public class Test3 {
	
	public static void main(String[] args) {
		String s="little star";
		char [] c =s.toCharArray();
		FileWriter fout=null;
		try {
			 fout=new FileWriter("poem.txt",true);
			
			fout.write(c);
			fout.flush();
			log.info("DONE");
			
		} catch (FileNotFoundException e) {
			log.severe("FileNotFound Exception");
		} catch (IOException e) {
			log.severe("IO Exception");
		}
		try {
			fout.close();
		} catch (IOException e) {
			log.severe("IO Exception");
		}
			
	}
	}


