package com.example.demo.customer;

import java.util.Arrays;
import java.util.List;


public class CustomerFakeRepository implements CustomerRepo {
    @Override
    public List<Customer> getCustomers() {
        return Arrays.asList(
                new Customer(1l, "Shahnewaz", "demo@mail.com", "123"),
                new Customer(2l, "Tameem", "demo@mail.com", "564")
        );
    }
}
