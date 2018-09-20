package com.leavemanagementsystem.demo.Repositories;

import com.leavemanagementsystem.demo.Models.AppliedLeave;
import com.leavemanagementsystem.demo.Models.LeaveApply;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ManagerRepository extends CrudRepository<LeaveApply,Integer> {

    public List<LeaveApply> findAllByUsername(String username);
}
