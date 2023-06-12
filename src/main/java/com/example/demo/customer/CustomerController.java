package com.example.demo.customer;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(path = "api/v1/customers")
@RestController
public class CustomerController {
    private final CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping
    List<Customer> getCustomers() {
        return customerService.getCustomers();
    }

    @GetMapping(path = "{customerId}")
    Customer getCustomer(@PathVariable("customerId") Long id) {
        return customerService.getCustomer(id);
    }

    @PostMapping
    void createNewCustomer(@Valid @RequestBody Customer customer) {
        System.out.println("POST REQUEST:==");
        System.out.println(customer);
    }

    @PutMapping("/")
    void updateCustomer(@RequestBody Customer customer) {
        System.out.println("UPDATE REQUEST:==");
        System.out.println(customer);
    }

    @DeleteMapping(path="{customerId}")
    void deleteCustomer(@PathVariable("customerId") Long id) {
        System.out.println("DELETE REQUEST:==" + id);
    }
}
