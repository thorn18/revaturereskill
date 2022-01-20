package src.SpringJPA2.src.main.java.com.revature.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import src.SpringJPA2.src.main.java.com.revature.EmployeeNotFoundException;
import src.SpringJPA2.src.main.java.com.revature.beans.Employee;
import src.SpringJPA2.src.main.java.com.revature.repo.EmployeeRepo;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepo employeeRepo ;

    public EmployeeRepo getEmployeeRepo() {
        return employeeRepo;
    }

    @Autowired
    public void setEmployeeRepo(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }
    // save
    public Employee save(Employee employee){
        return employeeRepo.save(employee);
    }

    // find by id
    public Employee find(int id){
        return employeeRepo.findById(id);
    }

    // find all
    public List<Employee> findAll(){
        return (List<Employee>) employeeRepo.findAll();
    }

    // update
    public Employee update(Employee emp) throws EmployeeNotFoundException {
        Employee employee =  find(emp.getId());
        return employeeRepo.save(emp);
    }

    // delete
    public void delete(int id){
        employeeRepo.deleteById(id);
    }
}
