package tn.esprit.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


@EnableWebMvc
@SpringBootApplication
public class PiApplication {

	public static void main(String[] args) {
		SpringApplication.run(PiApplication.class, args);
	}

}
