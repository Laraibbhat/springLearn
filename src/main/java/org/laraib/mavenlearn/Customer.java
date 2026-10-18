package org.laraib.mavenlearn;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Customer implements Comparable<Customer> {
    private String name;
    private String email;
    private  String password;
    private Date birthDate;
    private double regAmount;
    public static SimpleDateFormat sdf;

    static {
        sdf = new SimpleDateFormat("dd-MM-yyyy");
    }

    public Customer(String name, String email, String password, Date birthDate, double regAmount) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.birthDate = birthDate;
        this.regAmount = regAmount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public double getRegAmount() {
        return regAmount;
    }

    public void setRegAmount(double regAmount) {
        this.regAmount = regAmount;
    }
    @Override
    public int compareTo(Customer o) {

        int ret = this.birthDate.compareTo(o.birthDate);
        if (ret == 0) {
            return this.name.compareTo(o.name);
        }
        return ret;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", birthDate=" + sdf.format(birthDate) +
                ", regAmount=" + regAmount +
                '}';
    }
}
