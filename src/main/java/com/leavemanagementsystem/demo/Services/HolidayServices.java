package com.leavemanagementsystem.demo.Services;

import com.leavemanagementsystem.demo.Models.Company;
import com.leavemanagementsystem.demo.Models.Employee;
import com.leavemanagementsystem.demo.Models.Holiday;
import com.leavemanagementsystem.demo.Models.LeaveApply;
import com.leavemanagementsystem.demo.Repositories.CompanyRepository;
import com.leavemanagementsystem.demo.Repositories.HolidayRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.List;

@Service
public class HolidayServices {


        @Autowired
        HolidayRepository holidayRepository;

        @Autowired
        EmployeeServices employeeServices;

        @Autowired
        CompanyServices companyServices;
        public void add(Holiday holiday)
        {
            holidayRepository.save(holiday);
        }


    public List<Holiday> getAllHoliday(@ModelAttribute LeaveApply leaveApply)
    {
        Employee employee = employeeServices.get1(leaveApply.getUsername());


       Company company= companyServices.getCompany(employee);

        return holidayRepository.findAllByCompanyId(company.getCompanyId());
    }
}


