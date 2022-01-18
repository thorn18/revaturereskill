package src.Hibernate.src.com.revature.HybernateMethods;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import src.Hibernate.src.com.revature.SessionFactoryMaker;

import java.util.List;

public class FindAllEmployee {

    public static void main(String[] args) {
        SessionFactory sessionFactory = SessionFactoryMaker.getFactory();
        Session session = sessionFactory.openSession();

        session.beginTransaction();

        com.revature.beans.Employee emp = session.find(com.revature.beans.Employee.class, 1);
        Query query = session.createQuery("from Employee ");
        List<com.revature.beans.Employee> employees = query.list();
        employees.stream()
                .forEach(System.out::println);

        session.close();
        sessionFactory.close();
    }
}
