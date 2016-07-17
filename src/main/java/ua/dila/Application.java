package ua.dila;

import java.util.Date;

import org.hibernate.Session;


import ua.dila.entity.Departments;
import ua.dila.util.HibernateUtil;


public class Application {

	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.getTransaction().begin();
		
		Departments dep = new Departments();
		dep.setDeptName("hfghf");
		dep.setAct(true);
		dep.setDateStart(new Date());
		
		
	
		
		session.save(dep);
		session.getTransaction().commit();
		session.close();
	}
}
