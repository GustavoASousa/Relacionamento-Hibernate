package org.libertas.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Produto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idproduto;
	
	private String descricao;
	private double preco;
	private int estoque;
	
	
	@ManyToOne
	@JoinColumn (name = "idmarcafk")
	private Marca marca;
}
