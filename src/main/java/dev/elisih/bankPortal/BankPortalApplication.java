package dev.elisih.bankPortal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication // This is enough for autoconfiguration
@RestController
public class BankPortalApplication {

	public static void main(String[] args) {
		System.out.println(System.getenv("MONGO_DATABASE"));
		System.out.println(System.getenv("MONGO_USER"));
		System.out.println(System.getenv("MONGO_PASSWORD"));
		System.out.println(System.getenv("MONGO_CLUSTER"));
		SpringApplication.run(BankPortalApplication.class, args);
	}

	@GetMapping("/")
	public String apiRoot() {
		return "Hello World!";
	}

//	@Bean
//	public PasswordEncoder passwordEncoder() {
//		return new BCryptPasswordEncoder();
//	}


}
