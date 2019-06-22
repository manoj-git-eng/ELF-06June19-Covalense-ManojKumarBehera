package com.covalense.javaapp.filehandler;

import java.io.File;
import java.io.IOException;

public class Test8 {
	public static void main(String[] args) {
		File f = new File("movies/hindi/programfiles");
		boolean res=f.mkdirs();
		System.out.println("result is "+res);
	}
}
