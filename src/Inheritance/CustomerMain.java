package Inheritance;

import java.util.List;

public class CustomerMain {
    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager();
        List<Customer> customers = customerManager.getAll();

        for (Customer customer: customers){
            System.out.println(customer.getFirstName());
        }

        Customer customer = new Customer(3,"Mustafa","İnce", "mustafa@mail.com","1123", "5555", "İstanbul");
        customerManager.addCustomer(customer);

        Customer updatedCustomer = new Customer();
        updatedCustomer.setId(1);
        updatedCustomer.setFirstName("Tuğçe");
        updatedCustomer.setAddress("Çankaya");
        updatedCustomer.setLastName("Karaman");
        customerManager.updateCustomer(updatedCustomer.getId(), updatedCustomer);

        System.out.println("---------------");

        for (Customer customer1: customers){
            System.out.println(customer1.getFirstName());
        }

        customerManager.deleteCustomer(3);
        System.out.println("---------------------------");

        for (Customer customer1:customers){
            System.out.println(customer1.getFirstName());
        }

    }
}