package src.Hibernate.src.com.revature.beans;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import src.Hibernate.src.com.revature.SessionFactoryMaker;

public class ModifyEmployee {
    public static void main(String[] args) {
        SessionFactory sessionFactory = SessionFactoryMaker.getFactory();
        Session session = sessionFactory.openSession();

        session.beginTransaction();

        Transaction transaction = session.beginTransaction();
        com.revature.beans.Employee employee = session.find(com.revature.beans.Employee.class, 2);
        employee.setFirstName("Mark");
        employee.setLastName("Horn");
        session.update(employee);

        transaction.commit();
    }

}
