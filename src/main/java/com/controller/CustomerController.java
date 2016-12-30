package com.controller;

import com.entities.Customer;
import com.entities.Turnover;
import com.entities.dao.CustomerDao;

import com.entities.dao.TurnoverDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.Date;
import java.util.List;

@Controller
@RequestMapping(value = "/customer")
public class CustomerController {
    @Autowired
    private CustomerDao _customerDao;
    @Autowired
    private TurnoverDao _turnoverDao;

    @RequestMapping(value = "/add")
    @ResponseBody
    public String create(String lastName, String firstName, Date birthDate) {
        try {
            Customer customer = new Customer(lastName, firstName, birthDate);
            Turnover turnover= new Turnover(0,customer);
            _customerDao.save(customer);
            _turnoverDao.save(turnover);
        } catch (Exception ex) {
            return ex.getMessage();
        }
        return "User succesfully added!";
    }

    @RequestMapping(value = "/peer")
    @ResponseBody
    public List<Customer> peer(){
        return _customerDao.getPeerGroup(2);
    }

}
