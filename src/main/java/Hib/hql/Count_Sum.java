package Hib.hql;


import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Count_Sum {

	public static void main(String[] args) throws Exception {
		Configuration cfg = new Configuration(); 
	    cfg.configure("hibernate.cfg.xml"); 
	    
	    SessionFactory sf = cfg.buildSessionFactory(); 
	    Session session = sf.openSession(); 
	    
	    String hql1 = "select count(*) from Employee"; 
	    Query<Long> qry1 = session.createQuery(hql1,Long.class); 
	    long count = qry1.getSingleResult(); 
	    System.out.println("Total Employees="+count); 
	    
	    String hql2 = "select sum(esal) from Employee"; 
	    Query<Long> qry2 = session.createQuery(hql2,Long.class); 
	    long totalsal = qry2.getSingleResult(); 
	    System.out.println("Total Salary="+totalsal); 
	  
	    session.close(); 
	    sf.close(); 

	}

}
