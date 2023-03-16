package application;

import javax.persistence.EntityManager;

import dominio.Pessoa;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Program {

	public static void main(String[] args) {
		
		
		
		Pessoa p1 = new Pessoa(null, "Kauan", "kauan@gmail.com");
		Pessoa p2 = new Pessoa(null, "Carlos", "carlos@gmail.com");
		Pessoa p3 = new Pessoa(null, "Ana", "ana@gmail.com");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = (EntityManager) emf.createEntityManager();
		em.getTransaction().begin();
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		
		em.getTransaction().commit();
		System.out.println("Pronto");

	}

}
