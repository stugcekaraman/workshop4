package Inheritance;

import java.util.ArrayList;
import java.util.List;

public class CustomerManager {
    private List<Customer> customers;
    public CustomerManager(){
        customers = new ArrayList<>();
        Customer customer1 = new Customer(1,"Tuğçe","Karaman","tugce@mail.com","123","5555555","Ankara");
        Customer customer2 = new Customer(2,"Berfin", "Elbir", "berfin@mail.com", "1234ab", "4444444","İzmir");
        customers.add(customer1);
        customers.add(customer2);

    }
    public void addCustomer(Customer customer){
        customers.add(customer);
    }
    public void deleteCustomer(int id) {
        for (Customer customer : customers) {
            if (customer.getId() == id) {
                customers.remove(customer);
                break;
            }
        }
    }

    public void updateCustomer(int id, Customer updatedCustomer) {
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getId() == id) {
                customers.set(i, updatedCustomer);
                break;
            }
        }
    }

    public Customer getById(int id) {
        for (Customer customer : customers) {
            if (customer.getId() == id) {
                return customer;
            }
        }
        return null;
    }
    public List<Customer> getAll() {
        return customers;
    }


}
