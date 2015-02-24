package net.andreaskluth.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.hateoas.config.EnableEntityLinks;
import org.springframework.hateoas.config.EnableHypermediaSupport;
import org.springframework.hateoas.config.EnableHypermediaSupport.HypermediaType;

@SpringBootApplication
@EnableEntityLinks
@EnableHypermediaSupport(type = { HypermediaType.HAL })
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
