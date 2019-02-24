package org.sathyatech.raghu.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ConsoleARunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("from A Runner");
	}

}
