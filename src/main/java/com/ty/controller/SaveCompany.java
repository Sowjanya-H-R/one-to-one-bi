package com.ty.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.dto.Company;
import com.ty.dto.Gst;

public class SaveCompany {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Company company=new Company();
		company.setName("IBM");
		company.setPhno(44128245);
		
		Gst gst=new Gst();
		gst.setGstNmuber("DFG12456");
		gst.setStatus("Not Active");
		
		gst.setCompany(company);
		entityManager.persist(gst);
		entityManager.persist(company);

		entityTransaction.begin();
		
		entityTransaction.commit();
		System.out.println("--------data stored-----------");
	}

}
