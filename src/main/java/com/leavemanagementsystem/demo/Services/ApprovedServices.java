package com.leavemanagementsystem.demo.Services;

import com.leavemanagementsystem.demo.Models.AppliedLeave;
import com.leavemanagementsystem.demo.Models.ApprovedLeave;
import com.leavemanagementsystem.demo.Models.Employee;
import com.leavemanagementsystem.demo.Repositories.ApprovedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

@Service
public class ApprovedServices {

    @Autowired
    ApprovedRepository approvedRepository;

    public void add(ApprovedLeave approvedLeave)
    {
        approvedRepository.save(approvedLeave);
    }

    public List<ApprovedLeave> get(String username)
    {
        List<ApprovedLeave> list=new ArrayList<>();
        approvedRepository.findAllByUsername(username).forEach(new Consumer<ApprovedLeave>() {
            @Override
            public void accept(ApprovedLeave approvedLeave) {
                list.add(approvedLeave);
            }
        });
        return  list;
    }


}
