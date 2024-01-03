// Define o pacote para a classe AnimalServiceApplication
package com.pazzini.animalservice;

// Importa as classes necessárias do Spring Boot
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Classe principal que inicia a aplicação Spring Boot
@SpringBootApplication
public class AnimalServiceApplication {

    // Método principal que inicia a aplicação Spring Boot
    public static void main(String[] args) {
        // Inicia a aplicação Spring Boot, passando a classe AnimalServiceApplication e os argumentos fornecidos
        SpringApplication.run(AnimalServiceApplication.class, args);
    }

}
