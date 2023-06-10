package com.example.demo.customer;

import java.util.Arrays;
import java.util.List;


public class CustomerFakeRepository implements CustomerRepo {
    @Override
    public List<Customer> getCustomers() {
        return Arrays.asList(
                new Customer(1l, "Shahnewaz", "123"),
                new Customer(2l, "Tameem", "564")
        );
    }
}
