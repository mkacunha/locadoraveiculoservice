package br.mkacunha.locadora.conf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import br.mkacunha.locadora.controller.AbstractGenericController;
import br.mkacunha.locadora.model.Veiculo;
import br.mkacunha.locadora.repository.VeiculoRepository;
import br.mkacunha.locadora.service.AbstractGenericService;

@SpringBootApplication
@EntityScan(basePackageClasses = { Veiculo.class })
@ComponentScan(basePackageClasses = { AbstractGenericController.class, AbstractGenericService.class })
@EnableJpaRepositories(basePackageClasses = { VeiculoRepository.class })
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
