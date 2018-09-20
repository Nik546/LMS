package com.leavemanagementsystem.demo.Repositories;

import com.leavemanagementsystem.demo.Models.LeaveApply;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

import static org.hibernate.hql.internal.antlr.HqlTokenTypes.FROM;
import static org.hibernate.hql.internal.antlr.HqlTokenTypes.SELECT;
@Repository
public interface LeaveApplyRepository extends CrudRepository<LeaveApply,Integer> {

//    @Query(SELECT * FROM leaveapply WHERE)
//    public List<LeaveApply> fetchLeaves(String thisusername);

    public List<LeaveApply> findAllByUsername(String userName);

}
