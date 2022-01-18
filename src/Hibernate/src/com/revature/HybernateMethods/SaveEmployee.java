package src.Hibernate.src.com.revature.HybernateMethods;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import src.Hibernate.src.com.revature.SessionFactoryMaker;
import src.Hibernate.src.com.revature.beans.Employee;

public class SaveEmployee {
    public static void main(String[] args) {
        SessionFactory sessionFactory = SessionFactoryMaker.getFactory();
        Session session = sessionFactory.openSession();

        session.beginTransaction();

        Employee employee1 = new Employee("Tally", "Ingred");
        Employee employee2 = new Employee("Mark", "Bolton");
        Employee employee3 = new Employee("Tyler", "Smith");

        session.save(employee1);
        session.save(employee2);
        session.save(employee3);

        session.getTransaction().commit();
        System.out.println("Employee saved successfully");
    }
}
