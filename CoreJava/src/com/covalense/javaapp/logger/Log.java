package com.covalense.javaapp.logger;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.LogManager;
import java.util.logging.ConsoleHandler;


public class Log {
private static final Logger loger =Logger.getLogger("Priya");
public static void main(String[] args) {
	
	LogManager.getLogManager().reset();
	loger.setLevel(Level.ALL);
	
	ConsoleHandler ch=new ConsoleHandler();
	ch.setLevel(Level.CONFIG);
	loger.addHandler(ch);
	
	loger.log(Level.SEVERE,"HI i am severe");
	loger.log(Level.WARNING,"HI i am warning");
	loger.log(Level.INFO,"HI i am info");
	loger.log(Level.CONFIG,"HI i am config");
	loger.log(Level.FINE,"HI i am fine");
	loger.log(Level.FINER,"HI i am finer");
	loger.log(Level.FINEST,"HI i am finest");
}
}
