package com.db1start.cidades.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "conta")
public class Conta {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "saldo")
	private Double saldo;

	@OneToOne
	private Cliente cliente;

	@ManyToOne
	@JoinColumn
	private Agencia agencia;

	public Conta(Cliente cliente, Agencia agencia) {
		this.saldo = 0.0;
		this.cliente = cliente;
		this.agencia = agencia;
		agencia.getContas().add(this);
	}

	public Conta() {

	}

	public Long getId() {
		return id;
	}

	public Double getSaldo() {
		return saldo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public Agencia getAgencia() {
		return agencia;
	}

}
