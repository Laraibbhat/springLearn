package org.laraib.mavenlearn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test1 {

    public static void main(String[] args) {
//        Employee e = new Manager();
//        e.calculateSalary();
//
//        ArrayList<Employee> employees = new ArrayList<>();
//        ArrayList<Manager> managers = new ArrayList<>();
//
//        employees = managers; // cause a compile-time error because ArrayList<Employee> is not a supertype of ArrayList<Manager>
//
//        ArrayList<Object> objects = new ArrayList<>();
//        objects = employees; // cause a compile-time error because ArrayList<Object> is not a supertype of ArrayList<Employee>
//        objects=managers; // cause a compile-time error because ArrayList<Object> is not a supertype of ArrayList<Manager>
//
//        ArrayList<?> list1 = new ArrayList<>();
//        list1 = employees; // This is allowed because ArrayList<?> can hold any type of ArrayList
//        list1 = managers; // This is allowed because ArrayList<?> can hold any type of
//
        List<String> list22 = Arrays.asList("laraib", "hello","world", "bye"); // This is allowed because List is a raw type and can hold any type of List
        Collections.shuffle(list22);
        System.out.println(list22);


    }
}
