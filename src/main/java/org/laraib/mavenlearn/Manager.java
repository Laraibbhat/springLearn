package org.laraib.mavenlearn;

public class Manager implements Employee {
    @Override
    public int calculateSalary() {
        System.out.println("Calculating salary for Manager");
        return 100;
    }
}
