import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jMain {
	
	private static final Logger logger = LogManager.getLogger(Log4jMain.class);
	
	public static void main(String []args) {
		System.out.println("This is main class");
		logger.info("This is info message");
		logger.warn("This is Warn message");
		logger.error("This is the Error message");
		logger.fatal("This is fatal message");
	}
	
}
