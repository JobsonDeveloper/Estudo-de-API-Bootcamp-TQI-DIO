package com.dio_api.projeto_api_dio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/*
* O projeto Spring foi criado utilizando o Spring Initializr
* Os seguintes módulos foram selecionados:
* - Spring Data JPA
* - Spring Web
* - H2 Database
* - OpenFeign
*  */

@EnableFeignClients // Habilitar o Feign no projeto
@SpringBootApplication
public class ProjetoApiDioApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetoApiDioApplication.class, args);
	}
}
