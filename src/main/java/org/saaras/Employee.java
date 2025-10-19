package org.saaras;

public class Employee {
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
    public String toString(){
        return name+" "+salary;
    }
}
