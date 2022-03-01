package org.siir.redalyc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"org.siir.redalyc.controller", "org.siir.redalyc.service", "org.siir.redalyc.dao"})//Ruta de controladores
@EnableJpaRepositories(basePackages = {"org.siir.redalyc.repository"})//Ruta de repositorios DAO
@EntityScan(basePackages = {"org.siir.redalyc.model"})//Ruta modelo
public class PostulacionS3Application {

	public static void main(String[] args) {
		SpringApplication.run(PostulacionS3Application.class, args);
	}
}
