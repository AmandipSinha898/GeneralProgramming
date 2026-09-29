package org.saaras;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Employee implements Comparable{
    private int id;
    private String name;
    private double salary;

    Employee(int id, String name, double salary){
        this.id=id;
        this.name=name;
        this.salary=salary;

        //return this;
    }

    public double getSalary(){
        return this.salary;
    }

    @Override
    public int compareTo(Employee emp) {
        return Double.compare(this.salary, emp.salary); // Added missing semicolon here
    }

    @Override
    public String toString(){
        return name+" "+salary;
    }

    public static void main(String[] args) {
        List<Employee> emp=new ArrayList<>();
        emp.add(new Employee(1, "Alice", 50000.0));
        emp.add(new Employee(2, "Bob", 60000.0));
        emp.add(new Employee(3, "Charlie", 75000.0));

        Employee secondHighest=emp.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .skip(1)
                .findFirst()
                .orElse(null);

        Employee secondHighest1=emp.stream()
                .sorted((s1, s2) -> s1.compareTo(s2););


    }



}
