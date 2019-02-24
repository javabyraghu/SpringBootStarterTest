package org.sathyatech.raghu;

import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"org.sathyatech.raghu","org.sathyatech.runner"})
public class SpringBootStarterTestApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication s=new SpringApplication(SpringBootStarterTestApplication.class);
		s.setBannerMode(Banner.Mode.OFF);
		ConfigurableApplicationContext ac=s.run(args);
		System.out.println(ac.getClass().getName());
		
	}

	@Bean
	public Product prod() {
		Product p=new Product();
		p.setProdId(23);
		return p;
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Starter also a component");
	}
}
//@ComponentScan
//@Component
//@Configuration