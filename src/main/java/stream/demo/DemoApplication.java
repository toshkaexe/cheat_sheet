package stream.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {


		Logger logger = LogManager.getLogger(DemoApplication.class);

		SpringApplication.run(DemoApplication.class, args);
		logger.debug("Debug log message");
		logger.info("Info log message");
		logger.error("Error log message");
	}

}
