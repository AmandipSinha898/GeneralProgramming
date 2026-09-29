package org.saaras;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Employee implements Comparable<Employee> { // FIXED: Use Comparable instead of Comparator
    private int id;
    private String name;
    private double salary;

    Employee(int id, String name, double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Employee() {
    }

    public double getSalary(){
        return this.salary;
    }

    @Override
    public String toString(){
        return name + " " + salary;
    }

    @Override
    public int compareTo(Employee o) {
        return Double.compare(this.salary, o.salary);
    }

    public static void main(String[] args) {
        List<Employee> emp = new ArrayList<>(); // FIXED: Added  type safety
        emp.add(new Employee(1, "Alice", 50000.0));
        emp.add(new Employee(2, "Bob", 60000.0));
        emp.add(new Employee(3, "Charlie", 75000.0));

        // Approach 2: Using your custom compareTo (reversed for descending order)
         emp.stream()
                        .sorted((s1,s2) -> s1.compareTo(s2))

                               ;

        System.out.println("Second Highest: " + secondHighest1);
    }


}