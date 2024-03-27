package edu.iu.rdarji.primeservice.repository;

import edu.iu.rdarji.primeservice.model.Customer;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.logging.Logger;

public interface IAuthenticationRepository {
    boolean save(Customer customer) throws IOException;
    Customer findByUsername(String username) throws IOException;
}

