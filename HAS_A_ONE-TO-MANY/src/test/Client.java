package test;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import beans.Actor;
import beans.Movies;

public class Client {
	public static void main(String[] args) {
		
		Configuration cfg =new Configuration();
		cfg.configure("resources/Hibernate.cfg.xml");
		SessionFactory sf =cfg.buildSessionFactory();
		Session s  =sf.openSession();
		Transaction t = s.beginTransaction();
			
			Actor amir = new Actor();
			amir.setAid(1);
			amir.setactorName("Amir Khan");
			
			Movies m1 = new Movies();
			m1.setMid(1);
			m1.setMovieName("Pk");
			
			Movies m2 = new Movies();
			m2.setMid(2);
			m2.setMovieName("lagaan");
			
			Set<Movies> set = new HashSet<Movies>();
			set.add(m1);
			set.add(m2);
			
			amir.setMovies(set);
			
			s.save(m1);
			s.save(m2);
			s.save(amir);
			t.commit();
			System.out.println("insertion success");
			
	}

}
