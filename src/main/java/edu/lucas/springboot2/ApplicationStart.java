package edu.lucas.springboot2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// @EnableAutoConfiguration
// @ComponentScan
// @Configuration
@SpringBootApplication // inclui todas as annotations de cima
public class ApplicationStart {
    public static void main(String[] args) {
        // Configuração para rodar um projeto Spring
        SpringApplication.run(ApplicationStart.class, args);
    }
}
