package edu.iu.rdarji.primeservice.repository;

import edu.iu.rdarji.primeservice.model.Customer;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthenticationDBRepository extends CrudRepository<Customer, String> {
        Customer findByUsername(String username);
}
