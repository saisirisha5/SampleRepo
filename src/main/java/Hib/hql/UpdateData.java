package Hib.hql;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class UpdateData {

    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");

        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();
        Transaction transaction = session.beginTransaction();

        String hql = "update Employee set e_name = :name, e_sal = :salary where e_no = :id";
        Query qry = session.createQuery(hql);
        qry.setParameter("name", "Siri");
        qry.setParameter("salary", 60000);
        qry.setParameter("id", 3);

        int n = qry.executeUpdate();
        if (n > 0) {
            System.out.println("Employee Updated Successfully");
        } else {
            System.out.println("Employee ID Not Found");
        }
        transaction.commit();
        session.close();
        sf.close();
    }
}


