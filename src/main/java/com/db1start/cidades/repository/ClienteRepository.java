package com.db1start.cidades.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.db1start.cidades.domain.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{

	Optional<Cliente> findByNome(String nome);
	
	Optional<Cliente> findById(Long id);
}
