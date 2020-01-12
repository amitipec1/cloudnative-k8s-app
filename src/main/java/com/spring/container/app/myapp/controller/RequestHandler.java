package com.spring.container.app.myapp.controller;


import com.spring.container.app.myapp.jpa.Customer;
import com.spring.container.app.myapp.jpa.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class RequestHandler {

    @Autowired
    CustomerRepository customerRepository;

    @PostMapping(path="/add") // Map ONLY POST Requests
    public @ResponseBody String addNewUser (@RequestParam("firstName") String firstName, @RequestParam("lastName") String lastName) {
        // @ResponseBody means the returned String is the response, not a view name
        // @RequestParam means it is a parameter from the GET or POST request

        Customer n = new Customer();
        n.setFirstName(firstName);
        n.setLastName(lastName);
        Customer customer=customerRepository.save(n);
        return customer.getId().toString();
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<Customer> getAllUsers() {
        // This returns a JSON or XML with the users
        return customerRepository.findAll();
    }
}
