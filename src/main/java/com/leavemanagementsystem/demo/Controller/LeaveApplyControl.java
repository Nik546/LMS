package com.leavemanagementsystem.demo.Controller;

import com.leavemanagementsystem.demo.Models.AppliedLeave;
import com.leavemanagementsystem.demo.Models.Employee;
import com.leavemanagementsystem.demo.Models.LeaveApply;
import com.leavemanagementsystem.demo.Services.LeaveApplyServices;
import com.leavemanagementsystem.demo.Services.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LeaveApplyControl {

    @Autowired
    ManagerService managerService;

    @Autowired
    LeaveApplyServices leaveApplyServices;

    @PostMapping(value = "/applyleave")
    public void register(@RequestBody LeaveApply leaveApply)
    {
        leaveApplyServices.add(leaveApply);

//        AppliedLeave appliedLeave=new AppliedLeave();
//        appliedLeave.setLeaveId(leaveApply.getLeaveId());
//        managerService.add(appliedLeave);

    }

    @PostMapping(value = "/getAllLeave")
    public List<LeaveApply> getLeaves(@RequestBody Employee employee) {
        System.out.println(employee.getUsername());
        return leaveApplyServices.getAllLeaves(employee.getUsername());
    }

    @PostMapping(value = "/deleteNowLeave")
    public void deleteLeave(@RequestBody LeaveApply leaveApply)
    {
        leaveApplyServices.delete(leaveApply);
    }

}
