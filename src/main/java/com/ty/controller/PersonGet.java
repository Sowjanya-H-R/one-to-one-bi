package com.ty.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.dto.Pan;
import com.ty.dto.Person;

public class PersonGet {

	public static void main(String[] args) throws InterruptedException {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = factory.createEntityManager();
		Person person = entityManager.find(Person.class, 1);
		System.out.println("Person Id is :" + person.getId());
		System.out.println("Person Age  is :" + person.getAge());
		System.out.println("Person Name is :" + person.getName());
		System.out.println("--------------" );
		
		Thread.sleep(2000);
		Pan pan=person.getPan();
		System.out.println("Pan Id is :" + pan.getId());
		System.out.println("Pan Father Name is :" + pan.getFatherName());
		System.out.println("Pan Pan Number is :" + pan.getPanNumber());
		System.out.println("--------------" );


	}
}
