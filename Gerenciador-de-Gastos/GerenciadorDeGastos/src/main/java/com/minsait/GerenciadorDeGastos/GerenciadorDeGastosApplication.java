package com.minsait.GerenciadorDeGastos;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.minsait.GerenciadorDeGastos.model.Gasto;
import com.minsait.GerenciadorDeGastos.repository.GastoRepository;

@SpringBootApplication
public class GerenciadorDeGastosApplication {

	public static void main(String[] args) {
		SpringApplication.run(GerenciadorDeGastosApplication.class, args);
	}
	
	@Bean
	CommandLineRunner initDatabase(GastoRepository gastoRepository) {
		return args -> {
			gastoRepository.deleteAll();
	        gastoRepository.save(new Gasto(
	                "Compra de supermercado",
	                "R$150.00",
	                "01/02/2024"
	            ));
	            
	            gastoRepository.save(new Gasto(
	                "Conta de luz",
	                "R$80.00",
	                "05/02/2024"
	            ));
	            
	            gastoRepository.save(new Gasto(
	                "Jantar em restaurante",
	                "R$120.00",
	                "14/02/2024"
	            ));
	            
	            gastoRepository.save(new Gasto(
	                "Combusível",
	                "R$200.00",
	                "20/02/2024"
	            ));
	            
	            gastoRepository.save(new Gasto(
	                "Conta de internet",
	                "R$90.00",
	                "28/02/2024"
	            ));
		};
	}

}
