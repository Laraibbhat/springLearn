package utils;

import org.laraib.mavenlearn.Customer;

import java.text.ParseException;
import java.util.ArrayList;

public class CollectionUtils {

    // add a static method to return populated list of customer
    public static ArrayList<Customer> populateList() throws ParseException {
        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(
                new Customer("Laraib Mushtaq Bhat", "john.doe@example.com", "password123",  Customer.sdf.parse("01-01-1990"), 1000.0));
        customers.add(
                new Customer("SJane Smith", "jane.smith@example.com", "password456",  Customer.sdf.parse("15-06-1985"), 1500.0));
        customers.add(
                new Customer("zohn Doe", "john.doe@example.com", "password123",  Customer.sdf.parse("01-01-1989"), 1000.0));new Customer("kohn Doe", "john.doe@example.com", "password123",  Customer.sdf.parse("01-01-1990"), 1000.0);
        customers.add(
                new Customer("kohn Doe", "john.doe@example.com", "password123",  Customer.sdf.parse("01-01-1989"), 1000.0));new Customer("zohn Doe", "john.doe@example.com", "password123",  Customer.sdf.parse("01-01-1990"), 1000.0);
        customers.add(
                new Customer("ohn Doe", "john.doe@example.com", "password123",  Customer.sdf.parse("01-01-1985"), 1000.0));new Customer("aohn Doe", "john.doe@example.com", "password123",  Customer.sdf.parse("01-01-1990"), 1000.0);
        customers.add(
                new Customer("Laraib Mushtaq", "laraib.mushtaq@example.com", "password123",  Customer.sdf.parse("01-01-1990"), 1000.0));


        return customers;
    }
}
