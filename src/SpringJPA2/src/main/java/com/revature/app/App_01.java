package src.SpringJPA2.src.main.java.com.revature.app;

import src.SpringJPA2.src.main.java.com.revature.beans.Employee;
import src.SpringJPA2.src.main.java.com.revature.service.EmployeeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App_01 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        Employee employee = new Employee("Tyler",20);

        EmployeeService employeeService = (EmployeeService) context.getBean("employeeService");
        System.out.println("Saving employee : "+employee);
        Employee savedEmployee = employeeService.save(employee);
        System.out.println("Saved employee : "+savedEmployee);
        System.out.println("Employee saved successfully");

    }
}
