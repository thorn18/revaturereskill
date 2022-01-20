package src.SpringJPA.src.main.java.com.revature.app;

import com.revature.beans.Employee;
import src.SpringJPA.src.main.java.com.revature.controller.SaverController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App_01 {
    public static void main(String[] args) {
        Employee employee = new Employee(101, "Kishor", "Kumar", 10);
        ApplicationContext ctxt = new ClassPathXmlApplicationContext("spring.xml");
        SaverController controller = ctxt.getBean(SaverController.class);
        controller.save(employee);
    }
}
