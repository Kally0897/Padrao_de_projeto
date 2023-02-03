package one.digitalinnovation.gof;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
* Projeto Spring Boot gerado via Spring Initializr.
* Os seguintes módulos foram selecionados:
* - Spring Data JPA
* - Spring Web
* - H2 Database
* - OpenFeign
* */

@SpringBootApplication
@EnableFeignClients
public class PadroesDeProjetosApplication {

	public static void main(String[] args) {
		SpringApplication.run(PadroesDeProjetosApplication.class, args);
	}

}
