package com.leavemanagementsystem.demo.Services;

import com.leavemanagementsystem.demo.Models.LeaveApply;
import com.leavemanagementsystem.demo.Repositories.LeaveApplyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;


@Service
public class LeaveApplyServices {

    @Autowired
    LeaveApplyRepository leaveApplyRepository;

    public void add(LeaveApply leaveApply) {
        System.out.println("im here");
        leaveApplyRepository.save(leaveApply);
    }

//    public LeaveApply getleave(LeaveApply leaveApply) {
////        List<LeaveApply> leaveApply1 = new LinkedList<>();
//        if(leaveApplyRepository.existsById(leaveApply.getUsername()))
//        {
//            return leaveApplyRepository.findById(leaveApply.getUsername()).get();
//        };
//        return new LeaveApply();
//
//
//
//    }

    public void delete(@ModelAttribute LeaveApply leaveApply)
    {
        System.out.println();
        leaveApplyRepository.deleteById(leaveApply.getLeaveId());
    }

    public List<LeaveApply> getAllLeaves(String userName) {

        List<LeaveApply> list=new ArrayList<>();
        leaveApplyRepository.findAllByUsername(userName).forEach(new Consumer<LeaveApply>() {
            @Override
            public void accept(LeaveApply leaveApply) {
                list.add(leaveApply);
            }
        });
        return  list;
//        return leaveApplyRepository.findAllByUsername(userName);
    }
}
