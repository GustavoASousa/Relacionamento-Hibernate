package org.libertas.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Endereco {
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private int idendereco;
	 
	 private String logradouro;
	 private int numero;
	 private String bairro;
	 private String cep;
 
	 @OneToOne
	 private Cidade cidade; 
 
}
