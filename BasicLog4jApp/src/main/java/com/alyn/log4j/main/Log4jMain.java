package com.alyn.log4j.main;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jMain {
	
	private static final Logger logger = LogManager.getLogger(Log4jMain.class);
	
	public static void main(String[] args) {
		
		logger.debug("This is debug message");
		logger.info("This is info level message");
		logger.error("This is error level message");
		logger.fatal("This is fatal level message");
		
	}
	
}
