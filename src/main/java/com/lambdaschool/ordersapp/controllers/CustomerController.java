package com.lambdaschool.ordersapp.controllers;

import com.lambdaschool.ordersapp.models.Customer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController
{
//    // http://localhost:2019/customers/orders
//    @GetMapping(value = "/orders", produces = {"application/json"})
//    public ResponseEntity<?> listCustomerOrders()
//    {
////        List<Customer>
//        return null;
//    }

    // http://localhost:2019/customers/customer/77

    // http://localhost:2019/customers/namelike/mes

    // http://localhost:2019/customers/namelike/cin

}
