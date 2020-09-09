package com.lambdaschool.ordersapp.services;

import com.lambdaschool.ordersapp.models.Customer;
import com.lambdaschool.ordersapp.repositories.CustomersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Transactional
@Service(value = "customerServices")
public class CustomerServicesImpl implements CustomerServices
{
    @Autowired
    CustomersRepository custrepos;

    @Override
    public Customer save(Customer customer)
    {
        return custrepos.save(customer);
    }

    @Override
    public List<Customer> findCustomerOrders()
    {
        List<Customer> customerList = new ArrayList<>();
        custrepos.findAll().iterator().forEachRemaining(customerList::add);
        return customerList;
    }

    @Override
    public List<Customer> findByCustCode(long custcode)
    {
        List<Customer> customerList = custrepos.findByCustcode(custcode);
        return customerList;
    }
}
