package org.sathyatech.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ConsoleBRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("from B Runner");
	}

}
