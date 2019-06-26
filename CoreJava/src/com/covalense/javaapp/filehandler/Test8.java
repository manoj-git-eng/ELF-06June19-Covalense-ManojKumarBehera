package com.covalense.javaapp.filehandler;

import java.io.File;

import lombok.extern.java.Log;

@Log
public class Test8 {
	public static void main(String[] args) {
		File f = new File("movies/hindi/programfiles");
		boolean res = f.mkdirs();
		log.info("result is " + res);
	}
}
