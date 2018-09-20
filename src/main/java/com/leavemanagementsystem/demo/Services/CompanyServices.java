package com.leavemanagementsystem.demo.Services;

import com.leavemanagementsystem.demo.Models.Company;
import com.leavemanagementsystem.demo.Models.Employee;
import com.leavemanagementsystem.demo.Repositories.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

@Service
public class CompanyServices {
    @Autowired
    CompanyRepository companyRepository;

    public void add(Company company)
    {
        companyRepository.save(company);
    }

    public List<Company> getallCompany()
    {
        List<Company> list=new ArrayList<>();
        companyRepository.findAll().forEach(new Consumer<Company>() {
            @Override
            public void accept(Company company) {
                list.add(company);
            }
        });
        return list;
    }

    public Company getCompany(Employee employee)
    {
//        if(companyRepository.existsById(employee.getUsername()))
        return companyRepository.findById(employee.getCompanyName()).get();
    }

    public  void delete(String companyName)
    {
        companyRepository.deleteById(companyName);
    }



}
