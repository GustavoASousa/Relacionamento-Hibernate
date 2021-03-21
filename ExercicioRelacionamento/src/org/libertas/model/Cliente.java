package org.libertas.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idcliente;
	
	private String nome;
	private String cpf;
	
	@OneToOne
	private Endereco endereco;
	
	@OneToMany
	private List<Pedido> pedidos;
	
	@OneToOne
	private Telefone telefone;

}
