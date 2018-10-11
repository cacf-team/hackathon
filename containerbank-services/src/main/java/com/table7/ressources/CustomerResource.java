package com.table7.ressources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.table7.card.CustomerRepository;
import com.table7.model.Customer;


@RestController
public class CustomerResource {

	@Autowired
	private CustomerRepository repository;

	@RequestMapping("/customers")
	public List<Customer> findAll() {
		final List<Customer> customers = repository.findAll();
		return customers;
	}

	@RequestMapping(value = "/customers", method = RequestMethod.POST, consumes = { "application/json" })
	public void save(@RequestBody Customer customer) {
		repository.save(customer);
	}

}
