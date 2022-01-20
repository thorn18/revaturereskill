package src.SpringJPA2.src.main.java.com.revature.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import src.SpringJPA2.src.main.java.com.revature.EmployeeNotFoundException;
import src.SpringJPA2.src.main.java.com.revature.beans.Employee;
import src.SpringJPA2.src.main.java.com.revature.service.EmployeeService;

import java.util.List;

public class App_02
{
    public static void main(String[] args) throws EmployeeNotFoundException {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        EmployeeService empService = (EmployeeService) context.getBean("employeeservice");
        List<Employee> employees = empService.findAll();
        employees.stream().forEach(System.out::println);

        Employee e1 = null;
        e1 = empService.find(78);
        System.out.println(e1);

    }
}
