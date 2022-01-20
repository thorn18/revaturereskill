package src.SpringJPA2.src.main.java.com.revature;

public class EmployeeNotFoundException extends Exception {
    public EmployeeNotFoundException(String errorMessage, Throwable err) {
        super(errorMessage, err);
    }
}
