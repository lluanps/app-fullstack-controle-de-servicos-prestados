package com.luan.csp.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table
public class Servico implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(nullable = false, length = 255)
	private String descricao;
	
	@ManyToOne
	@JoinColumn(name = "cliente_id")
	private Cliente cliente;
	
	@Column
	private BigDecimal valor;
	
	public Servico() {
	}
	
}
