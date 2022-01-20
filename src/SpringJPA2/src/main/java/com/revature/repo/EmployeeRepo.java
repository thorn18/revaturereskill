package src.SpringJPA2.src.main.java.com.revature.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import src.SpringJPA2.src.main.java.com.revature.beans.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

    public void deleteById(int id);

    public Employee findById(int id);

    public Employee save(Employee e);
}
