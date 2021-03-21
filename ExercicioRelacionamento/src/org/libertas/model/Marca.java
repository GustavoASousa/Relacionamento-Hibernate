package org.libertas.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Marca {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idmarca;
	
	private String nomeMarca;
}
