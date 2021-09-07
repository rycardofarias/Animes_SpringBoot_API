package rycardofarias.animes.springboot.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "rycardofarias.animes.springboot")
public class ApplicationStart {

	public static void main(String[] args) {

		SpringApplication.run(ApplicationStart.class, args);

	}

}
