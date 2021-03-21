package org.libertas.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Pedido {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idpedido;
	
	private int numeroPedido;
	private String data;
	
	@ManyToMany
	private List<Produto> produtos;
	
	
}
