package com.ty.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.dto.Pan;
import com.ty.dto.Person;

public class GetPan {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = factory.createEntityManager();
		Pan pan = entityManager.find(Pan.class, 2);
		System.out.println("Pan Id is :" + pan.getId());
		System.out.println("Pan Father Name is :" + pan.getFatherName());
		System.out.println("Pan Pan Number is :" + pan.getPanNumber());
		System.out.println("--------------");

		Person person = pan.getPerson();
		System.out.println("Person Id is :" + person.getId());
		System.out.println("Person Age  is :" + person.getAge());
		System.out.println("Person Name is :" + person.getName());
		System.out.println("--------------");

	}
}
