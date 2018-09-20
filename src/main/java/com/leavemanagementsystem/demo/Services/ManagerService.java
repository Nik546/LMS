package com.leavemanagementsystem.demo.Services;

import com.leavemanagementsystem.demo.Models.AppliedLeave;
import com.leavemanagementsystem.demo.Models.Employee;
import com.leavemanagementsystem.demo.Models.LeaveApply;
import com.leavemanagementsystem.demo.Repositories.ManagerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.List;

@Service
public class ManagerService {

    @Autowired
    ManagerRepository managerRepository;
//    public void add(AppliedLeave appliedLeave)
//    {
//        managerRepository.save(appliedLeave);
//    }

    public List<LeaveApply> getAllLeave(@ModelAttribute Employee employee)
    {
       return managerRepository.findAllByUsername(employee.getManager());

    }
}
