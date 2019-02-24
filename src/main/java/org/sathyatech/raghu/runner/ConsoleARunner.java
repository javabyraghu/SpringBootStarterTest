package org.sathyatech.raghu.runner;

import org.sathyatech.raghu.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ConsoleARunner implements CommandLineRunner {
	@Autowired
	private Product prod;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("from A Runner::"+prod);
	}

}
