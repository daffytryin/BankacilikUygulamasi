package com.bank.application.Services;

/*
*implements kullanarak service kullanımı sağlanır
* */

import com.bank.application.Entities.Customer;
import com.bank.application.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public Customer findByIdentityNo(String identityNo) {
        return customerRepository.findByIdentityNo(identityNo);
    }

    @Override
    public Customer findByEmail(String email) {
        return customerRepository.findByEmail(email);
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public Customer findById(Long id) {
        return null;
    }

    @Override
    public Customer save(Customer customer) {
        return null;
    }
}
