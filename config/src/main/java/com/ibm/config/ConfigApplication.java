package com.ibm.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.ApplicationPidFileWriter;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableConfigServer
@EnableEurekaClient
public class ConfigApplication {

	public static void main(String[] args) {

		SpringApplication springApplication = new SpringApplication(ConfigApplication.class);
		springApplication.addListeners(new ApplicationPidFileWriter("configshutdown.pid"));
		springApplication.run(args);
	}

	
}
