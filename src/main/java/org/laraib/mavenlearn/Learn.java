package org.laraib.mavenlearn;


import utils.CollectionUtils;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;

public class Learn  {

    public static void main(String[] args) throws ParseException {
        ArrayList<Customer> customers = CollectionUtils.populateList();
        System.out.println("Before Sorting");
        for (Customer customer : customers) {
            System.out.println(customer);
        }
        Collections.sort(customers);
        System.out.println("\n\nAfter Sorting");

        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }


}
