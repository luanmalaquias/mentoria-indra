package com.minsait.GerenciadorDeGastos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.minsait.GerenciadorDeGastos.model.Gasto;
import com.minsait.GerenciadorDeGastos.repository.GastoRepository;


@RestController
@RequestMapping("/api/gastos")
public class GastoController {
	
	@Autowired
	private GastoRepository gastoRepository;
	
	@GetMapping
	@CrossOrigin(origins = "http://localhost:4200")
	public List<Gasto> list(){
		return gastoRepository.findAll();
	}
}
