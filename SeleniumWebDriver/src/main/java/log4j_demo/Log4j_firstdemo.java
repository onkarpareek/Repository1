package log4j_demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4j_firstdemo {
	
	static Logger logger = LogManager.getLogger(Log4j_firstdemo.class);
	
public static void main(String[] args) {
	
		System.out.println("starting execution..");
		
		logger.info("info");
		logger.error("error");
		logger.warn("warn");
		logger.fatal("fatal");
		
		System.out.println("completed...");
		
	}
}
