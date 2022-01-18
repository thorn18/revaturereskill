package src.Hibernate.src.com.revature.beans;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import src.Hibernate.src.com.revature.SessionFactoryMaker;

import java.util.List;

public class DeleteEmployee {

    public static void main(String[] args) {
        SessionFactory sessionFactory = SessionFactoryMaker.getFactory();
        Session session = sessionFactory.openSession();

        session.beginTransaction();

        Employee emp = new Employee("Tyler", "Horn");
        session.delete(emp);
        sessionFactory.close();
    }
}
