package com.leavemanagementsystem.demo.Repositories;

import com.leavemanagementsystem.demo.Models.ApprovedLeave;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import java.util.List;
@Repository
public interface ApprovedRepository extends CrudRepository<ApprovedLeave,String> {

    public List<ApprovedLeave> findAllByUsername(String username);


}
