package org.libertas;

import java.util.Collection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.libertas.model.Cliente;


public class MainTesteHibermate {
	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("ConexaoHibernate");
		EntityManager em = emf.createEntityManager();
		
		Query query = em.createQuery("SELECT c FROM cliente c");
		Collection<Cliente> lista = (Collection<Cliente>) query.getResultList();
		for (Cliente pessoa : lista) {
			System.out.println(pessoa);
		}
		
		
		em.close();
		emf.close();
	}
}
