package Hib.hql;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

	public class ReadData 
	{
	    public static void main( String[] args ) throws Exception
	    {
	        SessionFactory factory=new Configuration().configure().buildSessionFactory();
	        Session session=factory.openSession();
	        Transaction tx=session.beginTransaction();
	        
	        String hql="FROM Employee";
	        Query query = session.createQuery(hql);
	        
	       // String hql="FROM Employee WHERE e_sal > 10000";
	      //  Query query = session.createQuery(hql);
	        
	        List <Employee> emp = query.list();
	        for(Employee employee: emp)
	        {
	        	System.out.println("ID: "+employee.getEno());
	        	System.out.println("Name: "+employee.getEname());
	        	System.out.println("Department: "+employee.getEdept());
	        	System.out.println("Salary: "+employee.getEsal());
	        }
	        
		    tx.commit();
	        
	        session.close();
	        
	        factory.close();
	    }
	}




	/*	To read all the data without any conditions
	SessionFactory factory=new Configuration().configure().buildSessionFactory();
	Session session=factory.openSession();
	Transaction tx=session.beginTransaction();
	String hql="FROM employee";
	org.hibernate.Query query = session.createSQLQuery(hql);

	List <Employee> employees = query.list();
	for(Employee employee: employees)
	{
		System.out.println("ID"+employee.getNo());
		System.out.println("Name: "+employee.getEname());
		System.out.println(employee.getDept);
		System.out.println(employee.getSalary());
	} */