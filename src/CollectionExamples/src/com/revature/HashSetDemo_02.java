package com.revature;

import com.revature.beans.Employee;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo_02 {
    public static void main(String[] args) {
        HashSet<Employee> employees = new HashSet<>();
        Employee emp102 = new Employee(102,"Martin","King","king@gmail.com") ;
        employees.add(new Employee(103,"Scott","Tiger","scott@gmail.com"));
        employees.add(Employee.parseEmployee("105, Blake, Paul, blake@gmail.com"));
        employees.add(new Employee(101,"John","Mathew","john@gmail.com"));
        employees.add(new Employee(102,"Martin","King","king@gmail.com"));
        employees.add(new Employee(103,"Scott","Tiger","scott@gmail.com"));
        employees.add(new Employee(104, "Alen","Paul","alen@gmail.com"));
        employees.add(emp102);

        System.out.println("Hashcode "+new Employee(101,"John","Mathew","john@gmail.com").hashCode());
        System.out.println("Hashcode "+new Employee(101,"John","Mathew","john@gmail.com").hashCode());

        Iterator<Employee> employeeIterator = employees.iterator();
        while(employeeIterator.hasNext()){
            Employee employee = employeeIterator.next();
            System.out.println(employee);
        }
    }
}
