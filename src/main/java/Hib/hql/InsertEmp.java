package Hib.hql;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class InsertEmp {
	public static void main(String[] args)
	{
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		 Session session = factory.openSession();
		  Transaction tx = session.beginTransaction();
		  String insertQuery = "INSERT INTO Employee (e_dept,e_name, e_sal) VALUES (:d, :n, :s)";
		   Query q = session.createSQLQuery(insertQuery);
		    q.setParameter("d", "CSE");
		    q.setParameter("n", "rohith");
		    q.setParameter("s", 70000);
		    q.executeUpdate();
	  
		    
		    tx.commit();
	        
	        session.close();
	        
	        factory.close();
	}

	
}
