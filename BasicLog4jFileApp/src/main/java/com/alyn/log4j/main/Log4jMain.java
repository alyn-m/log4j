package com.alyn.log4j.main;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jMain {
	
	private final static Logger logger = LogManager.getLogger(Log4jMain.class);
	
	public static void main(String []args) {
		
		System.out.println("Welcome to logger application.");
		
		logger.info("This is info message");
		logger.debug("This is debug message");
		logger.error("This is error message");
		logger.fatal("This is Fatal message");
		
	}
	
}
