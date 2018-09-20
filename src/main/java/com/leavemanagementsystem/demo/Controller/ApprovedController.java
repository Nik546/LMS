package com.leavemanagementsystem.demo.Controller;

import com.leavemanagementsystem.demo.Models.ApprovedLeave;
import com.leavemanagementsystem.demo.Models.Employee;
import com.leavemanagementsystem.demo.Services.ApprovedServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ApprovedController {

    @Autowired
    ApprovedServices approvedServices;

    @PostMapping(value = "/addApprovedLeave")
    public void add(@RequestBody ApprovedLeave approvedLeave)
    {
        approvedServices.add(approvedLeave);

    }


    @PostMapping(value = "/getApprovedLeave")
    public List<ApprovedLeave> get(@RequestBody Employee employee)
    {
       return approvedServices.get(employee.getUsername());
//        System.out.println(list.get(0));
//        return list;
    }
}
