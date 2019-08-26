package com.mezeron.web;

import com.mezeron.bean.Customer;
import com.mezeron.multitenancy.ThreadLocalUtil;
import com.mezeron.repository.CustomerRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class LoginController {

    @Resource
    CustomerRepository customerRepository;


    @RequestMapping("get")
    @ResponseBody
    public List<Customer> getCustomer(String tenantSchema)
    {

        return (List<Customer>) customerRepository.findAll();
    }


}