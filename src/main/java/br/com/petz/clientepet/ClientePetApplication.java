package br.com.petz.clientepet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/")
public class ClientePetApplication {
	
	@GetMapping
	public String getNomeTest() {
		return "Cliente Pet - API HOME";
	}

	public static void main(String[] args) {
		SpringApplication.run(ClientePetApplication.class, args);
	}

}
