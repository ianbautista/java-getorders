package com.lambdaschool.ordersapp.repositories;

import com.lambdaschool.ordersapp.models.Customer;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CustomersRepository extends CrudRepository<Customer, Long>
{
    List<Customer> findByCustcode(long custcode);

}
