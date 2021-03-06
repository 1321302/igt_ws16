package com.controller;

import com.entities.Customer;
import com.entities.Turnover;
import com.entities.dao.TurnoverDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/turnover")
public class TurnoverController {
    @Autowired
    private TurnoverDao _turnoverDao;

    @RequestMapping(value = "/add")
    @ResponseBody
        public String create(double amount, Customer customer) {
            try {
                Turnover turnover = new Turnover(amount,customer);
                _turnoverDao.save(turnover);
            } catch (Exception ex) {
                return ex.getMessage();
            }
            return "Turnover succesfully added!";
        }
}
