package edu.iu.rdarji.primeservice.service;

import edu.iu.rdarji.primeservice.model.Customer;

import java.io.IOException;

public interface IAuthenticationService {
    Customer register(Customer customer) throws IOException;
    boolean login(String username, String password) throws IOException;
}
