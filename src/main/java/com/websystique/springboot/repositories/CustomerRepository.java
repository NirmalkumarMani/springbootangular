package com.websystique.springboot.repositories;
import java.util.List;
 
import org.springframework.data.repository.CrudRepository;
 
import com.websystique.springboot.model.Customer;
 
public interface CustomerRepository extends CrudRepository<Customer,Long> {
	List<Customer> findByLastName(String lastName);
}