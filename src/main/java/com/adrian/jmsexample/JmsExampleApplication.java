package com.adrian.jmsexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JmsExampleApplication {

	public static void main(String[] args) throws Exception {

//		ActiveMQServer server = ActiveMQServers.newActiveMQServer(new ConfigurationImpl()
//				.setPersistenceEnabled(false)
//				.setJournalDirectory("target/data/journal")
//				.setSecurityEnabled(false));
//
//		server.start();

		SpringApplication.run(JmsExampleApplication.class, args);
	}

}
