package com.leavemanagementsystem.demo.Controller;

import com.leavemanagementsystem.demo.Models.Company;
import com.leavemanagementsystem.demo.Services.CompanyServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CompanyController {
    @Autowired
    CompanyServices companyServices;

    @PostMapping(value = "/addCompany")
    public void add(@RequestBody Company company)
    {
        System.out.println("hi");
        companyServices.add(company);
    }

    @RequestMapping(value = "/getCompany")
    public List<Company> getallCompany()
    {
       return companyServices.getallCompany();
    }

    @RequestMapping(value = "/deleteCompany")
    public void deleteCompany(@RequestBody Company company)
    {
        companyServices.delete(company.getCompanyName());

    }

}
