package com.firstSpring.fullStackbackend;

import lombok.extern.log4j.Log4j2;
//import org.hibernate.cfg.Environment;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;

@Log4j2
@SpringBootApplication
public class FullStackBackendApplication {

	public static void main(String[] args) {

		SpringApplication.run(FullStackBackendApplication.class, args);
	}



	@Bean
	ApplicationRunner applicationRunner(Environment environment){
		System.out.println("hi78687");
		return new ApplicationRunner() {
			@Override
			public void run(ApplicationArguments args) throws Exception {
	  			log.info("hiaaaa"+ environment.getProperty("API_KEY"));
				System.out.println("hi");

			}
		};
	}

}
