package model;

import java.util.List;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ZJPA");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		try {
			List<Patient> list = entityManager.createQuery("select p from Patient p", Patient.class).getResultList();
			for(Patient patient : list) {
				System.out.println(patient.getFirstname() + " " + patient.getName());
			}
		} finally {
			entityManager.close();
			entityManagerFactory.close();
		}

	}

}
