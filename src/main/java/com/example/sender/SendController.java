package com.example.sender;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SendController {

	Logger logger = LoggerFactory.getLogger(SendController.class);

	@GetMapping("/send")
	public String index() {
		logger.info("Request happened.");
		
		// HelloWorld hello = new HelloWorld();
		// hello.print();

		SendMessageBatchSample sample = new SendMessageBatchSample();
        sample.run();

		return "Greetings from Spring Boot!";
	}

}
