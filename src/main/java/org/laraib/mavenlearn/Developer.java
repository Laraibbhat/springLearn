package org.laraib.mavenlearn;

public class Developer implements Employee {
    @Override
    public int calculateSalary() {
        System.out.println("Calculating salary for Developer");
        return 0;
    }
}
