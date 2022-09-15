package com.HbOnetoManyUni.daoimpl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.HbOnetoManyUni.Entity.Students;
import com.HbOnetoManyUni.Entity.Trainer;
import com.HbOnetoManyUni.config.HibernateUtil;
import com.HbOnetoManyUni.dao.TrainerDao;


public class TrainerDaoImpl implements TrainerDao{

	
	public void addTrainer() {
		Session s = HibernateUtil.getSessionFactory().openSession();
		Transaction t = s.beginTransaction();
		
		Trainer tt = new Trainer();
		tt.setTname("Mamta");
		tt.setCname("java");
		tt.setDesignation("Faculty");
		
		Students ss = new Students();
		ss.setAid(101);
		ss.setName("Pallavi");
		ss.setEmail("pallavi@gmail.com");
		ss.setPhone(78976643);
		
		Students ss1 = new Students();
		ss1.setAid(103);
		ss1.setName("Neha");
		ss1.setEmail("neha@gmail.com");
		ss1.setPhone(986766528);
		
		ArrayList<Students> al = new ArrayList<Students>();
		al.add(ss);
		al.add(ss1);
		
		tt.setStudents(al);
		
		s.save(tt);
		t.commit();
		s.close();
		
	}


	public void fetchTrainer() {
		Session s = HibernateUtil.getSessionFactory().openSession();
		@SuppressWarnings({ "deprecation", "unchecked" })
		Query<Trainer> q = s.createQuery("from Trainer");
		List<Trainer> ll = q.getResultList();
		
		Iterator<Trainer> itr = ll.iterator();
		while(itr.hasNext()) {
			Trainer ta = itr.next();
			System.out.println(ta.getTname() + " " + ta.getCname());
			
			List<Students> all = ta.getStudents();
			Iterator<Students> itr2 = all.iterator();
			while(itr2.hasNext()) {
				Students stu = itr2.next();
				System.out.println(stu.getName() + " " + stu.getPhone() + " " + stu.getEmail());	
		}
		
	}
	s.close();	
  }
}
