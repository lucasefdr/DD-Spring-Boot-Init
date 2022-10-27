package edu.lucas.springboot2.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

// Spring bean
@EnableAutoConfiguration
@ComponentScan(basePackages = "edu.lucas.springboot2")
public class ApplicationStart {
    public static void main(String[] args) {
        // Configuração para rodar um projeto Spring
        SpringApplication.run(ApplicationStart.class, args);
    }
}
