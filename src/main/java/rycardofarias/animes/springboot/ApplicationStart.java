package rycardofarias.animes.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class ApplicationStart {

	public static void main(String[] args) {

		SpringApplication.run(ApplicationStart.class, args);

	}

}
