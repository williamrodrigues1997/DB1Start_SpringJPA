package com.db1start.cidades.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.db1start.cidades.domain.entity.Cliente;
import com.db1start.cidades.service.ClienteService;

@RestController
public class ClienteController {

	@Autowired
	private ClienteService clienteService;

	// CRIAR

	@PostMapping("/cliente")
	public Cliente criarEstado(@RequestBody Cliente cliente) {
		return clienteService.criar(cliente.getNome(), cliente.getCpf());
	}

	// BUSCAR

	@GetMapping("/clientes")
	public List<Cliente> buscarTodosClientes() {
		return clienteService.buscarTodosClientes();
	}

	@GetMapping("/cliente/{id}")
	public Cliente buscarClientePorId(@PathVariable(value = "id") Long id) {
		return clienteService.buscarClientePorId(id);
	}

	// APAGAR

	@DeleteMapping("/clientes")
	public void apagarTodosClientes() {
		clienteService.apagarTodosClientes();
	}

	@DeleteMapping("/cliente/{id}")
	public void apagarClientePorId(@PathVariable(value = "id") Long id) {
		clienteService.apagarClientePorId(id);
	}

}
