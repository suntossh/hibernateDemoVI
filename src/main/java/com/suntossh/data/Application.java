package com.suntossh.data;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.suntossh.data.entities.User;

public class Application {

	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();

		session.getTransaction().begin();

		User user = new User();
			user.setBirthDate(new Date());
			user.setCity("Jersey City");
			user.setCreatedBy("Santoshkumar");
			user.setCreatedDate(new Date());
			user.setEmailAddress("Suntossh.numerouno@gmail.com");
			user.setFirstName("Santosh");
			user.setLastName("Pandey");
			user.setLastUpdatedBy("Santosh");
			user.setLastUpdatedDate(new Date());
			user.setState("NJ");
			user.setUserAddressLine1("400 Vanilla Avnue");
			user.setUserAddressLine2("Grove St 6th Street");
			user.setZipCode("07306");
		
		session.save(user);	
		session.getTransaction().commit();
		session.close();
	}

/*	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();


		Transaction transaction = session.beginTransaction();

		User user = new User();
			user.setBirthDate(new Date());
			user.setCity("Jersey City");
			user.setCreatedBy("Santoshkumar");
			user.setCreatedDate(new Date());
			user.setEmailAddress("Suntossh.numerouno@gmail.com");
			user.setFirstName("Santosh");
			user.setLastName("Pandey");
			user.setLastUpdatedBy("Santosh");
			user.setLastUpdatedDate(new Date());
			user.setState("NJ");
			user.setUserAddressLine1("400 Vanilla Avnue");
			user.setUserAddressLine2("Grove St 6th Street");
			user.setZipCode("07306");
		
		session.save(user);	
		
		transaction.commit();
			
		session.close();
	}*/

}
