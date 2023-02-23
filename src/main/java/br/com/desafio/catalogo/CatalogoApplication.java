package br.com.desafio.catalogo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/")
public class CatalogoApplication {
	@GetMapping
		public String getHomeTeste(){
			return "Catalogo";
		}
	public static void main(String[] args) {
		SpringApplication.run(CatalogoApplication.class, args);
	}

}
