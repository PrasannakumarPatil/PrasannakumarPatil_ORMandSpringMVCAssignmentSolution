package com.gl.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gl.entities.Customer;

@Service
public interface CustomerService {

	List<Customer> listAll();

	Customer findById(int id);

	void save(Customer customer);

	void deleteById(int id);
}
