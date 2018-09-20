package com.leavemanagementsystem.demo.Controller;
import com.leavemanagementsystem.demo.Models.AppliedLeave;
import com.leavemanagementsystem.demo.Models.Employee;
import com.leavemanagementsystem.demo.Models.LeaveApply;
import com.leavemanagementsystem.demo.Services.EmployeeServices;
import com.leavemanagementsystem.demo.Services.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ManagerConroller {

   @Autowired
   ManagerService managerService;

   @Autowired
   EmployeeServices employeeServices;

   @PostMapping(value = "/getAllManagerLeave")
   public List<LeaveApply> getAllLeave(@RequestBody Employee employee)
   {

      employee=employeeServices.validate(employee);
      System.out.println(employee.getManager());
      return managerService.getAllLeave(employee);
   }



}
