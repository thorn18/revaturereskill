package src.SpringJPA.src.main.java.com.revature.beans;

public class Employee {
    int id;
    String firstName;
    String lastName;
    int deptno;

    public Employee() {
    }

    public Employee(int id, String firstName, String lastName, int dpetno) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.deptno = dpetno;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getDeptno() {
        return deptno;
    }

    public void setDeptno(int deptno) {
        this.deptno = deptno;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", deptno=" + deptno +
                '}';
    }
}
