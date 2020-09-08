package com.lambdaschool.ordersapp.services;

import com.lambdaschool.ordersapp.models.Customer;

import java.util.List;

public interface CustomerServices
{
    Customer save(Customer customer);

    List<Customer> findCustomerOrders();
}
