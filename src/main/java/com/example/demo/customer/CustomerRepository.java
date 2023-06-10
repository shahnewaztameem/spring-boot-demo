package com.example.demo.customer;

import java.util.Collections;
import java.util.List;

public class CustomerRepository implements CustomerRepo{
    @Override
    public List<Customer> getCustomers() {
        // connect to read db
        return Collections.singletonList(
                new Customer(1l, "todo real db", "todo")
        );
    }
}
