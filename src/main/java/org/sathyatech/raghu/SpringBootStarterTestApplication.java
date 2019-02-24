package org.sathyatech.raghu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"org.sathyatech.raghu","org.sathyatech.runner"})
public class SpringBootStarterTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootStarterTestApplication.class, args);
	}

}
