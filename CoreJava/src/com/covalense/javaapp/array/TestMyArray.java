package com.covalense.javaapp.array;



import lombok.extern.java.Log;
@Log
public class TestMyArray {
	

	public static void main(String[] args) {
		long startTime =System.currentTimeMillis();
		MyArray m = new MyArray();
		int num=2;

		
		for (int i = 0; i < num; i++) {
			m.add("value =" + i);
		} // Giving the values
		
		
		log.info("removing 5rd position");
			m.remove(6); //removing one value
		

		for (int i = 0; i < num; i++) {

			log.info("Output" + m.get(i));
		} //Getting the values
		
		long endTime =System.currentTimeMillis();
		log.info("Total time is "+ (endTime-startTime)+"ms");
	}

}
