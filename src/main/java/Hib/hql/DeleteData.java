package Hib.hql;

import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class DeleteData {

  public static void main(String[] args)
  {
     Configuration cfg = new Configuration();
          cfg.configure("hibernate.cfg.xml");

          SessionFactory sf = cfg.buildSessionFactory();
          Session session = sf.openSession();
          Transaction transaction = session.beginTransaction();
          System.out.println("enter the id to delete : id(int)\n");
          Scanner sc=new Scanner(System.in);
         
          int id=sc.nextInt();
          
          //positional means update through ?1 , named means :name
          String hql = "delete from Employee where id = :id";
          Query qry = session.createQuery(hql);
          qry.setParameter("id", id);
          

          int n = qry.executeUpdate();
          if (n > 0) {
              System.out.println("Employee Deleted Successfully");
          } else {
              System.out.println("Employee ID Not Found");
          }
          sc.close();
          transaction.commit();
          session.close();
          sf.close();
  }
}
