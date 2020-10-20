package agilecraftDataSync.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
//hello
//hii
public class ExampleApplication {

	public static void main(String[] args) {

		SpringApplication.run(ExampleApplication.class, args);
	}

}
