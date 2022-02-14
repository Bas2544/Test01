package nvc.it.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import nvc.it.test.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{
    
}
