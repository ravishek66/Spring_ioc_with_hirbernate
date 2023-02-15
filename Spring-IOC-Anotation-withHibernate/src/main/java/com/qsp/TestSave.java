package com.qsp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSave {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Ravi");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
		Student student=(Student)context.getBean("student");
		Aadharcard aadharcard=(Aadharcard)context.getBean("aadharcard");
		
		student.setAadharcard(aadharcard);
		entityTransaction.begin();
		entityManager.persist(student);
		entityManager.persist(aadharcard);
		entityTransaction.commit();
		
		System.out.println(student);
		System.out.println(aadharcard);
	}
}
