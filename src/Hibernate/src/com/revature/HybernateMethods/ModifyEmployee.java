package src.Hibernate.src.com.revature.HybernateMethods;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import src.Hibernate.src.com.revature.SessionFactoryMaker;
import src.Hibernate.src.com.revature.beans.Employee;

public class ModifyEmployee {
    public static void main(String[] args) {
        SessionFactory sessionFactory = SessionFactoryMaker.getFactory();
        Session session = sessionFactory.openSession();

        session.beginTransaction();

        Transaction transaction = session.beginTransaction();
        Employee employee = session.find(Employee.class, 2);
        employee.setFirstName("Mark");
        employee.setLastName("Horn");
        session.update(employee);

        transaction.commit();
    }

}
