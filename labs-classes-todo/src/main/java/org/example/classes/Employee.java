package org.example.classes;

import javax.lang.model.element.NestingKind;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    public Employee(int id, String firstName, String lastName, int salary){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public String getLastName(){
        return lastName;
    }

    public int getId(){
        return id;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public int getAnnualSalary(){
        return salary * 12;
    }

    public String getFirstName(){
        return firstName;
    }
}
