package com.leavemanagementsystem.demo.Controller;

import com.leavemanagementsystem.demo.Models.Employee;
import com.leavemanagementsystem.demo.Services.EmployeeServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class EmployeeController {
    Employee employee1;


    @Autowired
    EmployeeServices employeeServices;



    @PostMapping(value = "/register")
    public void register(@RequestBody Employee employee)
    {
     employeeServices.register(employee);
    }

    @PostMapping(value = "/validate")
    public void validate(@RequestBody Employee employee)
    {
        employee1=employeeServices.validate(employee);



    }
    @GetMapping(value = "/getEmployee")
    public Employee innervalid()
    {

        return employee1;
    }

    @RequestMapping(value = "/getAll",method = RequestMethod.GET)
            public List<Employee> getAll()
    {
        return employeeServices.getAll();
    }

    @RequestMapping(value = "/deleteEmployee")
         public void deleteEmployee(@RequestBody Employee employee)
    {
        employeeServices.delete(employee.getUsername());

    }

}
