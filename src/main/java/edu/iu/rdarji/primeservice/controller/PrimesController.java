package edu.iu.rdarji.primeservice.controller;

import edu.iu.rdarji.primeservice.service.IPrimesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/primes")
public class PrimesController {

    IPrimesService primesService;

    public PrimesController(IPrimesService primesService)
    {
        this.primesService = primesService;
    }

    @GetMapping("/{n}")
    public boolean isPrime(@PathVariable int n) {
        return primesService.isPrime(n);
    }
}
